/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.ctre.phoenix.motorcontrol.ControlMode;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Intake extends SubsystemBase {
  /**
   * Creates a new ExampleSubsystem.
   */
  private TalonSRX intakeMotor = new TalonSRX(Constants.INTAKE_MOTOR_PORT);
  private DoubleSolenoid lArm = new DoubleSolenoid(Constants.LDS_PORT_1,Constants.LDS_PORT_2);
  private DoubleSolenoid rArm = new DoubleSolenoid(Constants.RDS_PORT_1,Constants.RDS_PORT_2);
  public Intake() {
    
  }
  public void retract{
    lArm.set(DoubleSolenoid.Value.kForward);
	  rArm.set(DoubleSolenoid.Value.kForward);
  }
  public void extend{
    lArm.set(DoubleSolenoid.Value.kReverse);
	  rArm.set(DoubleSolenoid.Value.kReverse);
  }
  public void feed{
    intakeMotor.set(ControlMode.PercentOutput,1);
  }
  public void stop{
    intakeMotor.set(ControlMode.PercentOutput,0);
	  lArm.set(DoubleSolenoid.Value.kOff);
	  rArm.set(DoubleSolenoid.Value.kOff);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

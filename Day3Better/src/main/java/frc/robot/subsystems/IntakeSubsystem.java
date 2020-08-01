/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import frc.robot.Constants;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;



public class IntakeSubsystem extends SubsystemBase {
  /**
   * Creates a new IntakeSubsystem.
   */
  DoubleSolenoid rightSolenoid;
  DoubleSolenoid leftSolenoid;
  TalonSRX intakeFeederTalon;

  public IntakeSubsystem() {

    this.rightSolenoid = new DoubleSolenoid(Constants.RIGHT_SOLENOID_PORT1, Constants.RIGHT_SOLENOID_PORT2);
    this.leftSolenoid = new DoubleSolenoid(Constants.LEFT_SOLENOID_PORT1, Constants.LEFT_SOLENOID_PORT2);
    this.intakeFeederTalon = new TalonSRX(0);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void intakeUp() {
    this.rightSolenoid.set(Value.kReverse);
    this.leftSolenoid.set(Value.kReverse);

  }

  public void intakeDown() {

    this.rightSolenoid.set(Value.kForward);
    this.leftSolenoid.set(Value.kForward);

  }

  public void intakeFeed() {

    this.intakeFeederTalon.set(ControlMode.PercentOutput, Constants.FULL_SPEED_FORWARD);

  }
}

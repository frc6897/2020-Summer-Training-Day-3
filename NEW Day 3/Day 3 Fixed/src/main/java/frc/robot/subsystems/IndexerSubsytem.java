/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.can.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;


public class IndexerSubsystem extends SubsystemBase {
  /**
   * Creates a new ExampleSubsystem.
   */
  private final CANSparkMax Motor1;
  private final CANSparkMax Motor2;
  private final TalonSRX shootingMotor;
  public IndexerSubsystem() {
    Motor1 = new CANSparkMax(0, CANSparkMaxLowLevel.MotorType.kBrushless);
    Motor2= new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
    shootingMotor = new TalonSRX(0);
  }
  public void feedBall() {
      //between -1 and 1, .5 = foward at half speed
      shootingMotor.set(ControlMode.PercentOutput,.5);
      Motor1.set(0.5);
  }
   
  public void ballUp() {
      // ball is going up at half speed
    Motor1.set(0.5);
  }
   
  public void ballDown() {
      //ball is going down at half speed
    Motor1.set(-0.5);
  }

  @Override
  public void reset() {
    Motor1.set(0);
    shootingMotor.set(ControlMode.PercentOutput,0);
  }
}
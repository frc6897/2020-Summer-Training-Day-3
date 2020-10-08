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

public class Indexer extends SubsystemBase {
  /**
   * Creates a new ExampleSubsystem.
   */
  private CANSparkMax topL = new CANSparkMax(Constants.TOP_L_MOTOR_PORT,CANSparkMaxLowLevel.MotorType.kBrushless);//top left motor
  private CANSparkMax topR = new CANSparkMax(Constants.TOP_R_MOTOR_PORT,CANSparkMaxLowLevel.MotorType.kBrushless);//top right motor
  private TalonSRX shooter = new TalonSRX(Constants.SHOOT_MOTOR_PORT);//shooter motor
  public Indexer() {
    topR.follow(topL,true);//set top right motor to follow top left motor and invert direction
  }
  public void down{
    shooter.set(ControlMode.PercentOutput,0);
    topL.set(1);
  }
  public void shoot{
    topL.set(0);
    shooter.set(ControlMode.PercentOutput,1);
  }
  public void stop{
    topL.set(0);
    shooter.set(ControlMode.PercentOutput,0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

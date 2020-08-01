/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.InvertType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IndexerSubsystem extends SubsystemBase {
  /**
   * Creates a new indexer.
   */
  private TalonSRX talon1;
  private TalonSRX talon2;
  private CANSparkMax sparkMax;
  
  public IndexerSubsystem() {
    this.talon1 = new TalonSRX(Constants.TALON_1_CANID);
    this.talon2 = new TalonSRX(Constants.TALON_2_CANID);
    this.sparkMax = new CANSparkMax(Constants.SPARKMAX_CANID, CANSparkMaxLowLevel.MotorType.kBrushless);
    
    talon2.set(ControlMode.Follower, 0);                  //the TalonSRXs will 
    talon2.setInverted(InvertType.OpposeMaster);         // be the two top motors
                                                        //  talon1 is top left motor, talon2 is top right motor


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void ballUp() {
    talon1.set(ControlMode.PercentOutput, Constants.FULL_SPEED_BACKWARD);   // sets talon1 (top left, master) counterclockwise and talon2 (top right, slave) to clockwise, pushing the ball up

  }

  public void ballDown() {

    sparkMax.set(Constants.FULL_SPEED_FORWARD);                              //sets sparkmax (bottom motor) to clockwise, pushing balls into shooter mechanism
    talon1.set(ControlMode.PercentOutput, Constants.FULL_SPEED_FORWARD);    // sets talon1 (top left, master) clockwise and talon2 (top right, slave) to counterclockwise, pulling the ball down

  }

  public void setMotorsOff() {
    talon1.set(ControlMode.PercentOutput, Constants.MOTORS_OFF);
    sparkMax.set(Constants.MOTORS_OFF);

  }
}
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
import frc.robot.Robot;



public class Indexer extends SubsystemBase {
  /**
   * Creates a new ExampleSubsystem.
   */
  private final CANSparkMax index_rightMotor;
  private final CANSparkMax feedBall_motor;
  public Indexer() {
    index_rightMotor = new CANSparkMax(Constants.RIGHT_INDEXER_MOTOR, MotorType.kBrushed);
    feedBall_motor = new CANSparkMax(Constants.INDEXER_FEEDER_MOTOR, MotorType.kBrushed);
  }
  public void feedBall() {
      //between -1 and 1, .5 = foward at half speed
    feed_motor.set(0.5);
  }
   
  public void ballUp() {
      // ball is going up at half speed
    index_rightMotor.set(0.5);
  }
   
  public void ballDown() {
      //ball is going down at half speed
    index_rightMotor.set(-0.5);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
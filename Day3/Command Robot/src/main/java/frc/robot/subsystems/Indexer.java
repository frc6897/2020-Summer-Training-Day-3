/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import frc.robot.Constants;
import frc.robot.Robot;
public class Indexer extends SubsystemBase {
  /**
   * Creates a new intakeSybsystem.
   */
   
  private final CANSparkMax indexrightmotor;
  private final CANSparkMax feedmotor;

  public Indexer (){
    indexrightmotor = new CANSparkMax( Constants.RIGHT_INDEXER_MOTOR, MotorType.kBrushless);
    feedmotor= new CANSparkMax(Constants.INDEXER_FEEDER_MOTOR, MotorType.kBrushless);
  
  public void feed(){
    feedmotor.set(0.5);
  }
  public void ballup(){
  indexrightmotor.set(0.5);
  }
  public void balldown(){
    indexrightmotor.set(-0.5);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

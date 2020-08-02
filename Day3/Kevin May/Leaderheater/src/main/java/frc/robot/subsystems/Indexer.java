/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANSparkMax;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;


public class ExampleSubsystem extends SubsystemBase {
  /**
   * Creates a new ExampleSubsystem.
   */
  private final CANSparkMax rightMotor;
  private final CANSparkMax leftMotor;
  private final TalonSRX centralMotor; 
  public Indexer() {

  CANSparkMax rightMotor = new CANSparkMax(constants.RIGHT_MOTOR, CANSparkMaxLowLevel.MotorType.kBrushless);
  CANSparkMax leftMotor = new CANSparkMax(constants.LEFT_MOTOR, CANSparkMaxLowLevel.MotorType.kBrushless);
  TalonSRX feedMotor = new TalonSRX(2);
  }
  public void moveUp() {
    rightMotor.set(.5);

  }
  public void moveDown() {
    leftMotor.set(-.5);
  }
  public void runSet() {
    feedMotor.set(.5);
  }
  @Override
  public void periodic() {

  }
}

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

/**
 * import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
**/

public class ExampleSubsystem extends SubsystemBase {
  CANSparkMax rightSpark = new CANSparkMax(Constants.RIGHT_SPARK, CANSparkMaxLowLevel.MotorType.kBrushless);
  CANSparkMax leftSpark = new CANSparkMax(Constants.LEFT_SPARK, CANSparkMaxLowLevel.MotorType.kBrushless);
  CANSparkMax botttomSpark = new CANSparkMax(Constants.BOTTOM_SPARK, CANSparkMaxLowLevel.MotorType.kBrushless);
  /**
   * Creates a new ExampleSubsystem.
   */
   public ExampleSubsystem() {
  
  }

  public void moveUp() {
    rightSpark.set(1);
    leftSpark.set(-1);
    botttomSpark.set(1);
  }

  public void moveDown() {
    rightSpark.set(-1);
    leftSpark.set(1);
    botttomSpark.set(-1);
  } 
  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }
}

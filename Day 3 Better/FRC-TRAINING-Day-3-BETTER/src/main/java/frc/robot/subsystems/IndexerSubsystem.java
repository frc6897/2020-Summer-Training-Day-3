package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.Robot;

public class IndexerSubsystem extends SubsystemBase {

  private TalonSRX shooterMotor;
  private CANSparkMax updownMotor1;
  private CANSparkMax updownMotor2;

  public IndexerSubsystem() {
    shooterMotor = new TalonSRX(0);
    updownMotor1 = new CANSparkMax(2, CANSparkMaxLowLevel.MotorType.kBrushless);
    updownMotor2 = new CANSparkMax(3, CANSparkMaxLowLevel.MotorType.kBrushless);

    updownMotor2.follow(updownMotor1, true);
  }

  @Override
  public void periodic() {
  }

  public void ballUp () {
    updownMotor1.set(1);  
  }

  public void shootBall () {
    updownMotor1.set(1);
    shooterMotor.set(ControlMode.PercentOutput, 1);
  }

  public void stopEverything () {
    updownMotor1.set(0);
    shooterMotor.set(ControlMode.PercentOutput, 0);
  }

}


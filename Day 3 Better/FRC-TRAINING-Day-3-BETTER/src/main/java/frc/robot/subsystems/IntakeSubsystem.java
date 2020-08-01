package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;
import frc.robot.Robot;

/*
So, I don't tihnk I understand exactly how intake
works, but I programmed this as if the system brings 
balls in hungry hungry hippo style. It first tilts
up, then lunges forward, then tilts down to the ground,
and then lunges backwards and brings any entrapped balls with it.
*/

public class IntakeSubsystem extends SubsystemBase {

  private Solenoid openingSolenoid;
  private Solenoid closingSolenoid;

  private CANSparkMax tiltMotor;

  public IntakeSubsystem() {
    openingSolenoid = new Solenoid(RobotMap.PCM_INTAKE_OPENSOLENOID);
    closingSolenoid = new Solenoid(RobotMap.PCM_INTAKE_CLOSESOLENOID);

    tiltMotor = new CANSparkMax(RobotMap.CAN_INTAKE_TILT, CANSparkMaxLowLevel.MotorType.kBrushless);
  }

  @Override
  public void periodic() {
  }

  public void tiltUp() {
    // Tilt intake up & get into position
    tiltMotor.set(1);
    openingSolenoid.set(true);
    closingSolenoid.set(false);
  }

  public void clampDown() {
    tiltMotor.set(-1);
  }

  public void reelIn() {
    openingSolenoid.set(false);
    closingSolenoid.set(true);
  }

  // This is resetConfiguration as opposed to shutEverythingOff
  // is the purpose of the cancel method to stop or to go back
  // to normal
  public void resetConfiguration () {
    openingSolenoid.set(false);
    closingSolenoid.set(true);
    tiltMotor.set(-1);
  }

}

package frc.robot.commands;

import frc.robot.RobotContainer;
import frc.robot.subsystems.IndexerSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

/**
 * An example command that uses an example subsystem.
 */
public class PrimeIntake extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

  public PrimeIntake(IntakeSubsystem subsystem) {
    addRequirements(RobotContainer.m_IntakeSubsystem);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    RobotContainer.m_IntakeSubsystem.tiltUp();
  }

  @Override
  public void end(boolean interrupted) {
    if (interrupted) {
      RobotContainer.m_IntakeSubsystem.resetConfiguration();
    }
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
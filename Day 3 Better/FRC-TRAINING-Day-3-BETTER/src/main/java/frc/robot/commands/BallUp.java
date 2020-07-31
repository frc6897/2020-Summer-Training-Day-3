package frc.robot.commands;

import frc.robot.RobotContainer;
import frc.robot.subsystems.IndexerSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

/**
 * An example command that uses an example subsystem.
 */
public class BallUp extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

  public BallUp(IndexerSubsystem subsystem) {
    addRequirements(RobotContainer.m_IndexerSubsystem);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    RobotContainer.m_IndexerSubsystem.ballUp();
  }

  @Override
  public void end(boolean interrupted) {
    if (interrupted) {
      RobotContainer.m_IndexerSubsystem.stopEverything();
    }
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
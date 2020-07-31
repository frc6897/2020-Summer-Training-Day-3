package frc.robot.commands;

import frc.robot.RobotContainer;
import frc.robot.subsystems.IndexerSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

/**
 * An example command that uses an example subsystem.
 */
public class ShootBall extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

  public ShootBall(IndexerSubsystem subsystem) {
    addRequirements(RobotContainer.m_IndexerSubsystem);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    RobotContainer.m_IndexerSubsystem.shootBall();
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
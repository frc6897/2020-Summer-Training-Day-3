/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.*;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.IndexerSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  public static IndexerSubsystem m_IndexerSubsystem = new IndexerSubsystem();
  public static IntakeSubsystem m_IntakeSubsystem = new IntakeSubsystem();

  // TODO: Check if these should be static or not
  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);
  public static ReelIn m_ReelIn = new ReelIn(m_IntakeSubsystem);
  public static ClampIntake m_ClampIntake = new ClampIntake(m_IntakeSubsystem);
  public static PrimeIntake m_PrimeIntake = new PrimeIntake(m_IntakeSubsystem);

  public static BallUp m_BallUp = new BallUp(m_IndexerSubsystem);
  public static ShootBall m_ShootBall = new ShootBall(m_IndexerSubsystem);

  public static Joystick accessibleJoystick;
  public Joystick joy = new Joystick(0);



  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    RobotContainer.accessibleJoystick = joy;
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    JoystickButton shootButton = new JoystickButton(joy, RobotMap.BUTTON_SHOOT_ID);
    JoystickButton ballUpButton = new JoystickButton(joy, RobotMap.BUTTON_SHOOT_ID);

    shootButton.whileHeld(m_ShootBall);
    ballUpButton.whileHeld(m_BallUp);
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}

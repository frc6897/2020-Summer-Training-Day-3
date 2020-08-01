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
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.BallUp;
import frc.robot.commands.BallDown;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.IntakeDownAndFeed;
import frc.robot.commands.IntakeUp;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.IndexerSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.commands.IntakeDownAndFeed;
import frc.robot.commands.IntakeUp;

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

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);
  public static BallUp m_BallUp = new BallUp();
  public static BallDown m_BallDown = new BallDown();
  public static IntakeUp m_IntakeUp = new IntakeUp();
  public static IntakeDownAndFeed m_IntakeDownAndFeed = new IntakeDownAndFeed();

  protected GenericHID operatorGamepad = new Joystick(Constants.JOYSTICK1_PORT);
  private JoystickButton button1 = new JoystickButton(operatorGamepad, Constants.BUTTON_1_PORT);
  private JoystickButton button2 = new JoystickButton(operatorGamepad, Constants.BUTTON_2_PORT);
  private JoystickButton button3 = new JoystickButton(operatorGamepad, Constants.BUTTON_3_PORT);
  private JoystickButton button4 = new JoystickButton(operatorGamepad, Constants.BUTTON_4_PORT);




  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {

    button1.whileHeld(new BallDown());
    button2.whileHeld(new BallUp());
    button3.whileHeld(new IntakeDownAndFeed());
    button4.whileHeld(new IntakeUp());
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

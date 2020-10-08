/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.BallDown;
import frc.robot.commands.Shoot;
import frc.robot.commands.RetractIntake;
import frc.robot.commands.ExtendIntake;
import frc.robot.commands.IntakeFeed;
import frc.robot.subsystems.Indexer;
import frc.robot.subsystems.Intake;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;


/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final Indexer m_Indexer = new Indexer();
  public static BallDown m_BallDown = new BallDown();
  public static Shoot m_Shoot = new Shoot();
  protected GenericHID js = new Joystick(Constants.JOYSTICK_PORT);
  private JoystickButton squareButton = new JoystickButton(js,1);
  private JoystickButton xButton = new JoystickButton(js,2);
  private JoystickButton circleButton = new JoystickButton(js,3);
  private JoystickButton triButton = new JoystickButton(js,4);
  private JoystickButton rJSButton = new JoystickButton(js,12);
  private final Intake m_Intake = new Intake();
  public static ExtendIntake m_ExtendIntake = new ExtendIntake();
  public static RetractIntake m_RetractIntake = new RetractIntake();
  public static IntakeFeed m_IntakeFeed = new IntakeFeed();

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
    squareButton.whileHeld(new BallDown());
    xButton.whileHeld(new Shoot());
	  circleButton.whileHeld(new ExtendIntake());
  	triButton.whileHeld(new RetractIntake());
	  rJSButton.whileHeld(new IntakeFeed()); 
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

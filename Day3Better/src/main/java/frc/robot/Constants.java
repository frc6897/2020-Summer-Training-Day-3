/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    //Motor Speeds
    public static double MOTORS_OFF = 0;
    public static double FULL_SPEED_FORWARD = 1;
    public static double FULL_SPEED_BACKWARD = -1;

    //Port Numbers
    public static int TALON_1_CANID = 0;
    public static int TALON_2_CANID = 1;
    public static int SPARKMAX_CANID = 2;
    public static int BUTTON_1_PORT = 0;
    public static int BUTTON_2_PORT = 1;
    public static int JOYSTICK1_PORT = 0;


}

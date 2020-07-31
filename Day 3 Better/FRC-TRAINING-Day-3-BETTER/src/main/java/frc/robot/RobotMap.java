package frc.robot;

public class RobotMap {
  // Ports
  public static final int CAN_INDEXER_UPDOWN1 = 0;
  public static final int CAN_INDEXER_UPDOWN2 = 1;
  public static final int CAN_INDEXER_SHOOTER = 2;

  public static final int PCM_INTAKE_OPENSOLENOID = 0;
  public static final int PCM_INTAKE_CLOSESOLENOID = 1;
  public static final int CAN_INTAKE_TILT = 3;


  // Button Bindings
  public static final int BUTTON_SHOOT_ID = 2; // X button
  public static final int BUTTON_BALLUP_ID = 1; // Square button
  public static final int POV_INTAKE_ID = 0; 


  // The private constructor forces the class to be
  // used statically
  private RobotMap () { }
}
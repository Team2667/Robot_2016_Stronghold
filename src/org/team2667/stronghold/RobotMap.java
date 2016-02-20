// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.team2667.stronghold;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveTrainLeftFrontCAN;
    public static CANTalon driveTrainLeftRearCAN;
    public static CANTalon driveTrainRightFrontCAN;
    public static CANTalon driveTrainRightRearCAN;
    public static RobotDrive driveTrainRobotDriveCAN;
    public static CANTalon ballManipulatorLeftSideShooter;
    public static CANTalon ballManipulatorRightSideShooter;
    public static Solenoid ballManipulatorLeftShooterSolenoid;
    public static Solenoid ballManipulatorRightShooterSolenoid;
    public static Compressor pnumaticsCompressor;
    public static Solenoid pnumaticsShooterSolenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftFrontCAN = new CANTalon(1);
        LiveWindow.addActuator("DriveTrain", "LeftFrontCAN", driveTrainLeftFrontCAN);
        
        driveTrainLeftRearCAN = new CANTalon(2);
        LiveWindow.addActuator("DriveTrain", "LeftRearCAN", driveTrainLeftRearCAN);
        
        driveTrainRightFrontCAN = new CANTalon(3);
        LiveWindow.addActuator("DriveTrain", "RightFrontCAN", driveTrainRightFrontCAN);
        
        driveTrainRightRearCAN = new CANTalon(4);
        LiveWindow.addActuator("DriveTrain", "RightRearCAN", driveTrainRightRearCAN);
        
        driveTrainRobotDriveCAN = new RobotDrive(driveTrainLeftFrontCAN, driveTrainLeftRearCAN,
              driveTrainRightFrontCAN, driveTrainRightRearCAN);
        
        driveTrainRobotDriveCAN.setSafetyEnabled(true);
        driveTrainRobotDriveCAN.setExpiration(0.1);
        driveTrainRobotDriveCAN.setSensitivity(0.25);
        driveTrainRobotDriveCAN.setMaxOutput(0.5);

        ballManipulatorLeftSideShooter = new CANTalon(5);
        LiveWindow.addActuator("BallManipulator", "LeftSideShooter", ballManipulatorLeftSideShooter);
        
        ballManipulatorRightSideShooter = new CANTalon(6);
        LiveWindow.addActuator("BallManipulator", "RightSideShooter", ballManipulatorRightSideShooter);
        
        ballManipulatorLeftShooterSolenoid = new Solenoid(7, 1);
        LiveWindow.addActuator("BallManipulator", "LeftShooterSolenoid", ballManipulatorLeftShooterSolenoid);
        
        ballManipulatorRightShooterSolenoid = new Solenoid(7, 2);
        LiveWindow.addActuator("BallManipulator", "RightShooterSolenoid", ballManipulatorRightShooterSolenoid);
        
        pnumaticsCompressor = new Compressor(7);
        
        
        pnumaticsShooterSolenoid = new Solenoid(7, 0);
        LiveWindow.addActuator("Pnumatics", "ShooterSolenoid", pnumaticsShooterSolenoid);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}

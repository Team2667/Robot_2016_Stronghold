// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.team2667.stronghold.subsystems;

import org.team2667.stronghold.RobotMap;
import org.team2667.stronghold.commands.IdleRaisedShooter;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class BallManipulator extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final CANTalon leftSideShooter = RobotMap.ballManipulatorLeftSideShooter;
    private final CANTalon rightSideShooter = RobotMap.ballManipulatorRightSideShooter;
    private final Solenoid leftShooterSolenoid = RobotMap.ballManipulatorLeftShooterSolenoid;
    private final Solenoid rightShooterSolenoid = RobotMap.ballManipulatorRightShooterSolenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    private boolean state = false;
    
    
    
    
    
    

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new IdleRaisedShooter());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    // Moves the motors in the opposite direction
    public void driveMotor(double speed) {
    	this.leftSideShooter.set(-speed);
    	this.rightSideShooter.set(speed);
    }
    
    // Stop the motors
    public void stop() {
    	this.leftSideShooter.set(0);
    	this.rightSideShooter.set(0);
    }
    
    public void fireSolenoids() {
    	leftShooterSolenoid.set(true);
    	rightShooterSolenoid.set(true);
    	state = true;
    }
    
    public void retractSolenoids() {
    	leftShooterSolenoid.set(false);
    	rightShooterSolenoid.set(false);
    	state = false;
    }
    
    public boolean getState() {
    	return state;
    }
    
}


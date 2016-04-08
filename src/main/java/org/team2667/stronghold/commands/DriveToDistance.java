package org.team2667.stronghold.commands;

import org.team2667.stronghold.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveToDistance extends Command {

	private double distance;
	
	public DriveToDistance(double distance) {
		this.distance = distance;
	}
	
	@Override
	protected void initialize() {
		
	}

	@Override
	protected void execute() {
		SmartDashboard.putNumber("Average Voltage of Rangefinder", Robot.driveTrain.getDistanceToObstacle());
		Robot.driveTrain.getRobotDrive().arcadeDrive(0.5, 0, true);
	}

	@Override
	protected boolean isFinished() {
		return Robot.driveTrain.getDistanceToObstacle() >= distance;
	}

	@Override
	protected void end() {
		Robot.driveTrain.stop();
	}

	@Override
	protected void interrupted() {
		end();
	}

}

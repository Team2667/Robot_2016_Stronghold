package org.team2667.stronghold.commands;

import org.team2667.stronghold.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TurnRobot extends Command {

	private long initialTime;
	private double initialAngle;
	private double rotationInDegrees;
	
	public TurnRobot(double rotationInDegrees) {
		requires(Robot.driveTrain);
		this.rotationInDegrees = rotationInDegrees;
	}
	
	@Override
	protected void initialize() {
		initialAngle = Robot.driveTrain.getAngle();
		initialTime = System.nanoTime() / 1000000L;
	}

	@Override
	protected void execute() {
		double turnSpeed = 0.8;
		Robot.driveTrain.getRobotDrive().arcadeDrive(0, 1, true);
		//System.out.println("Turning...");
	}

	@Override
	protected boolean isFinished() {
		// Stop if the gyro isn't working after five seconds.
		if (System.nanoTime() / 1000000L - initialTime >= 5000) {
			return true;
		}
		
		return Math.abs(initialAngle - Robot.driveTrain.getAngle()) % 360 >= rotationInDegrees;
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

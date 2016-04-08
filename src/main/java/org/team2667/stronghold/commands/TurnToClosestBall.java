package org.team2667.stronghold.commands;

import org.team2667.stronghold.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TurnToClosestBall extends Command {

	private double initialAngle;
	
	public TurnToClosestBall() {
		requires(Robot.driveTrain);
	}
	
	
	@Override
	protected void initialize() {
		initialAngle = Robot.driveTrain.getAngle();
	}

	@Override
	protected void execute() {
		
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.driveTrain.stop();
	}

	@Override
	protected void interrupted() {
		
	}

}

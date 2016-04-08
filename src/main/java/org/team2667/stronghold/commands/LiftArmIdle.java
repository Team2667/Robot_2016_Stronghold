package org.team2667.stronghold.commands;

import org.team2667.stronghold.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LiftArmIdle extends Command {

	public LiftArmIdle() {
		requires(Robot.liftArm);
	}
	
	@Override
	protected void initialize() {
		Robot.liftArm.disable();
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
		
	}

	@Override
	protected void interrupted() {
		end();
	}

}

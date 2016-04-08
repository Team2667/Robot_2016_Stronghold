package org.team2667.stronghold.commands;

import org.team2667.stronghold.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LowerArm extends Command {

	public LowerArm() {
		requires(Robot.liftArm);
	}
	
	@Override
	protected void initialize() {
		Robot.liftArm.enable();
	}

	@Override
	protected void execute() {
		Robot.liftArm.set(-1.0);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.liftArm.disable();
	}

	@Override
	protected void interrupted() {
		end();
	}

}

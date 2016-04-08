package org.team2667.stronghold.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousMoat extends CommandGroup {

	public AutonomousMoat() 
	{
		addParallel(new RaiseShooter());
		addSequential(new DriveStraight(1.0, 3500L));
	}

}

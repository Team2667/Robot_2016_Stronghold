package org.team2667.stronghold.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousRoughTerrain extends CommandGroup {

	public AutonomousRoughTerrain() 
	{
		addParallel(new RaiseShooter());
		addSequential(new DriveStraight(1.0, 4000L));
	}

}

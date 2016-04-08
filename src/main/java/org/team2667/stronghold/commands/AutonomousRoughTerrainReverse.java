package org.team2667.stronghold.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousRoughTerrainReverse extends CommandGroup {

	public AutonomousRoughTerrainReverse() {
		addParallel(new RaiseShooter());
		addSequential(new DriveStraight(-1.0, 2000L));
	}
	
}

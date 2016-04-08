package org.team2667.stronghold.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Autonomous360NoScope extends CommandGroup {

	public Autonomous360NoScope() {
		addSequential(new Wait(3000L));
		addParallel(new LowerShooter());
		
		addSequential(new Wait(3000L));
		addSequential(new DriveStraight(0.8, 500L));
		addParallel(new StartMotorsBackward());
		addParallel(new RaiseShooter());
		
		addSequential(new Wait(3000L));
		addSequential(new TurnRobot(360));
		addSequential(new ShootBall());
	}
	
}

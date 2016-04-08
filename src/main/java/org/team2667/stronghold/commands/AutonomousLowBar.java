package org.team2667.stronghold.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousLowBar extends CommandGroup {

	public AutonomousLowBar() 
	{
		addSequential(new Wait(3000L));
		addParallel(new LowerShooter());
		addSequential(new Wait(3000L));
		addSequential(new DriveStraight(0.5, 4000L));
		
		//addSequential(new DriveToDistance(5)); // 5 either meters or feet (not sure)
		
		addSequential(new TurnRobot(30));
		
		//addSequential(new Wait(1000L));
		//addSequential(new ShootBall());
	}

}

package org.team2667.stronghold.subsystems;

import org.team2667.stronghold.RobotMap;
import org.team2667.stronghold.commands.LiftArmIdle;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

public class LiftArm extends Subsystem {

	public CANTalon liftArmMotor = RobotMap.liftArmMotor;
	public DigitalInput limitSwitch = RobotMap.liftArmLimitSwitch;
	
	@Override
	protected void initDefaultCommand() {
		this.setDefaultCommand(new LiftArmIdle());
	}
	
	
	public void set(double speed) {
		liftArmMotor.set(speed);
	}
	
	public void enable() {
		liftArmMotor.enable();
	}
	
	public void disable() {
		liftArmMotor.disable();
	}
	
	public boolean limitSwitchActuated() {
		return limitSwitch.get();
	}

}

package org.usfirst.frc.pronto3070.robot.commands;

import org.usfirst.frc.pronto3070.robot.commands.SimpleCommand;
import org.usfirst.frc.pronto3070.robot.Robot;
import org.usfirst.frc.pronto3070.robot.hardware.Gamepad;

public class TeleopMode extends SimpleCommand{
	
	private Gamepad gamepad;
	
	public TeleopMode() {
		super("Teleop Command");
		
		//Add required subsystems here:
		requires(driveTrain);
	}
	
	@Override
	public void initialize() {
		gamepad = Robot.getGamepad();
	}
	
	@Override
	public void execute() {
		double leftThrottle = gamepad.leftStickY();
		double rightThrottle = gamepad.rightStickY();
		
		driveTrain.tankDrive(leftThrottle, rightThrottle);
		
		if(gamepad.A()) {
			//Do something when the A button is pressed
		}
	}
	
	@Override
	public boolean isFinished() {
		return false;
	}
}
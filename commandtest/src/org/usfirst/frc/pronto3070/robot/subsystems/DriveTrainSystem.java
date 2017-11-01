package org.usfirst.frc.pronto3070.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrainSystem extends Subsystem{
	
	private RobotDrive drive;
	
	/**
	 * Controls the motors using the tank drive configuration.
	 * 
	 * @param left  the power for the left motors.
	 * @param right the power for the right motors.
	 */
	public void tankDrive(double left, double right) {
		drive.tankDrive(left,  right);
	}
	
	@Override
	protected void initDefaultCommand() {
		
	}
}

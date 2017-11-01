package org.usfirst.frc.pronto3070.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.pronto3070.robot.Robot;
import org.usfirst.frc.pronto3070.robot.subsystems.*;

public abstract class SimpleCommand extends Command{
	
	//Subsystems
	//When a subsystem is added to Robot, add it here too.
	//Then, it can be referenced from any command.
	public DriveTrainSystem driveTrain = Robot.DriveTrain;
	
	public SimpleCommand(String name) {
		super(name);//The name of the command (Not sure what this actually does)
	}
}

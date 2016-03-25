package org.usfirst.frc.team2706.robot.commands.plays;

import org.usfirst.frc.team2706.robot.commands.ArmDownAuto;
import org.usfirst.frc.team2706.robot.commands.FloatControlAuto;
import org.usfirst.frc.team2706.robot.commands.StraightDriveWithEncoders;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class BreachPlayGyro extends CommandGroup {
	
	public BreachPlayGyro() {
		this.addSequential(new ArmDownAuto(),1);
		this.addParallel(new FloatControlAuto(true),0.2);
		//this.addSequential(new StraightDriveWithTime(0.0,1000));
		this.addSequential(new StraightDriveWithEncoders(0.6,19.5, 20));
		//this.addSequential(new ResetCameraEndAuto());
	}
}
package org.usfirst.frc.team4859.pneumatics;

import org.usfirst.frc.team4859.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
/**
 *
 */
public class Inp1 extends Command {

    public Inp1() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.pneu);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.pneu.In();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

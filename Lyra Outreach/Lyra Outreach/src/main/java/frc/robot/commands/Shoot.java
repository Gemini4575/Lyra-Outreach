package frc.robot.commands;

import edu.wpi.first.networktables.PubSub;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.AdvancerSubsystem;
import frc.robot.subsystems.ShooterSubsystem;

public class Shoot extends Command{
    private final ShooterSubsystem s;
    private final AdvancerSubsystem a;

    public Shoot(ShooterSubsystem ss, AdvancerSubsystem aa){
        s = ss;
        a = aa;
        addRequirements(s,a);
    }

    @Override
    public void execute(){
        s.shoot();
        a.Advance();
    }

    @Override 
    public boolean isFinished(){
        return false;
    }

    @Override
    public void end(boolean b){
        s.stop();
        a.stop();
    }
}

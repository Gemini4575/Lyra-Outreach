package frc.robot.commands.flipperEXO;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.AdvancerSubsystem;

public class Advance extends Command{
    private final AdvancerSubsystem a;
    public Advance(AdvancerSubsystem aa){
        a =aa;
        addRequirements(aa);
    }

    @Override
    public void execute(){
        a.Advance();
    }

    @Override
    public void end(boolean b){
        a.stop();
    }

    @Override
    public boolean isFinished(){
        return false;
    }
}

package frc.robot.commands.flipperEXO;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.FlipperSubsystem;

public class FlipperOut extends Command{
    private final FlipperSubsystem f;

    public FlipperOut (FlipperSubsystem ff){
        f = ff;
        addRequirements(f);
    }

    @Override
    public void initialize(){
        f.flipperOut();
    }

    @Override
    public boolean isFinished(){
        return f.flipperOut();
    }
}

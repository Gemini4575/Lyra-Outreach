package frc.robot.commands.flipperEXO;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.FlipperSubsystem;

public class FlipperIn extends Command{
    private final FlipperSubsystem f;

    public FlipperIn (FlipperSubsystem ff){
        f = ff;
        addRequirements(f);
    }

    @Override
    public void initialize(){
        f.flipperIn();
    }

    @Override
    public boolean isFinished(){
        return f.flipperIn();
    }
}

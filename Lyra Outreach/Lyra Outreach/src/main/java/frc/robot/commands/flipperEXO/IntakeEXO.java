package frc.robot.commands.flipperEXO;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeEXO extends Command{
    private IntakeSubsystem i;
    public IntakeEXO(IntakeSubsystem ii){
        i = ii;
        addRequirements(ii);
    }

    @Override 
    public void execute(){
        i.Intake();
    }

    @Override
    public boolean isFinished(){
        return false;
    }

    @Override
    public void end(boolean b){
        i.stop();
    }
}

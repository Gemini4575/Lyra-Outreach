package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.flipperEXO.Advance;
import frc.robot.commands.flipperEXO.FlipperIn;
import frc.robot.commands.flipperEXO.FlipperOut;
import frc.robot.commands.flipperEXO.IntakeEXO;
import frc.robot.subsystems.AdvancerSubsystem;
import frc.robot.subsystems.FlipperSubsystem;
import frc.robot.subsystems.IntakeSubsystem;

public class Intake extends SequentialCommandGroup{
    public Intake(FlipperSubsystem f, IntakeSubsystem i, AdvancerSubsystem a){
        addCommands(new FlipperOut(f).raceWith(new IntakeEXO(i).alongWith(new Advance(a))),
        new FlipperIn(f));
    }
}

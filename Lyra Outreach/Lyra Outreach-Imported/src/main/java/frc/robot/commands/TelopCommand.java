package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveTrainSubsystem;

public class TelopCommand extends Command{
    private final DoubleSupplier speedSupplier;
    private final DoubleSupplier turnSupplier;
    private final DriveTrainSubsystem d;

    public TelopCommand(DoubleSupplier speedSuppliers, DoubleSupplier turnSuppliers, DriveTrainSubsystem dd){
        speedSupplier = speedSuppliers;
        turnSupplier = turnSuppliers;
        d = dd;
        addRequirements(dd);
    }

    @Override
    public void execute(){
        d.drive(speedSupplier.getAsDouble(), turnSupplier.getAsDouble());
    }

    @Override
    public boolean isFinished(){
        return false;
    }

}

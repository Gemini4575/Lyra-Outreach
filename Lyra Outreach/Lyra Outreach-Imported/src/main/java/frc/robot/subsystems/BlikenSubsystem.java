package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class BlikenSubsystem extends SubsystemBase{
    private final Spark bliken = new Spark(6);

    public BlikenSubsystem(){
    }

    @Override
    public void periodic(){
        
    }
}

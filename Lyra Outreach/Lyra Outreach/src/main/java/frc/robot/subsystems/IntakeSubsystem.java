package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase{
    private Spark IntakeMotor = new Spark(1);

    public IntakeSubsystem(){

    }

    public void Intake(){
        IntakeMotor.set(-1.0);
    }

    public void ReverseIntake(){
        IntakeMotor.set(1.0);
    }

    public void stop(){
        IntakeMotor.stopMotor();
    }

    
}

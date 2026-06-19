package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class AdvancerSubsystem extends SubsystemBase{
    private SparkMax advancerMotor = new SparkMax(5, MotorType.kBrushed);

    public AdvancerSubsystem(){

    }

    public void Advance(){
        advancerMotor.set(1.0);
    }

    public void ReverseAdvance(){
        advancerMotor.set(-1.0);
    }

    public void stop(){
        advancerMotor.stopMotor();
    }

}

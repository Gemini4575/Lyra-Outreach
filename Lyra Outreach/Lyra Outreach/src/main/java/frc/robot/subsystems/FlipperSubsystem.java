package frc.robot.subsystems;

import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class FlipperSubsystem extends SubsystemBase{
    private final SparkMax flipperMotor = new SparkMax(7, MotorType.kBrushless);

    public FlipperSubsystem(){
        SparkMaxConfig flipperConfig = new SparkMaxConfig();
        flipperConfig.smartCurrentLimit(20, 20);
        flipperMotor.configure(
            flipperConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    }

    private boolean IflipperInI() {
        flipperMotor.set(0.25);
    
        return flipperMotor.getEncoder().getPosition() >= 0;
      }

    public boolean flipperIn(){
        if(IflipperInI()){
            flipperMotor.stopMotor();
            return true;
        }

        return false;
    }

    public boolean flipperOut(){
        if(IflipperOutI()){
            flipperMotor.stopMotor();
            return true;
        }

        return false;
    }
    
      private boolean IflipperOutI() {
        flipperMotor.set(-0.25);
    
        return flipperMotor.getEncoder().getPosition() <= -14;
      }

      @Deprecated
      public void TestFlipper(double output){
        // flipperMotor.set(output);
      }

      @Override
      public void periodic(){
        SmartDashboard.putNumber("Endcoder pose", flipperMotor.getEncoder().getPosition());
      }

}

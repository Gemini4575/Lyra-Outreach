package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase{
    private Spark m_shooter;

    public ShooterSubsystem(){
        m_shooter = new Spark(0);      
        SmartDashboard.putNumber("Shooter Speed", 100); 
    }

    public void shoot(){
        m_shooter.set(-SmartDashboard.getNumber("Shooter Speed", 100)/100);
    }

    public void reverseShoot(){
        m_shooter.set(SmartDashboard.getNumber("Shooter Speed", 100)/100);
    }

    public void stop(){
        m_shooter.stopMotor();
    }

}

package frc.robot;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.networktables.GenericEntry;

public class Shoot {
    private Spark m_shooter;
    private GenericEntry m_shooterSpeed;
    private GenericEntry m_shooterSpeedReverse;

    public Shoot (int shooter) {
        m_shooter = new Spark(shooter);
        m_shooterSpeed = Shuffleboard.getTab("Main")
            .add("Shooter Speed", 1.0)
            .getEntry();
        
        m_shooterSpeedReverse = Shuffleboard.getTab("Main")
            .add("Shooter Speed Reverse", -1.0)
            .getEntry();
    }

    public void Shooot (boolean Bbuuton, boolean XBuuton, boolean Ybuuton) {
         if (Bbuuton) {
            m_shooter.set(m_shooterSpeedReverse.getDouble(-1.0));
        } else if (XBuuton) {
            
        } else if (Ybuuton) {
            m_shooter.set(m_shooterSpeed.getDouble(1.0));
        } else {
            m_shooter.set(0);
        }
    }
}

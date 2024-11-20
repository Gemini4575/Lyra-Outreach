package frc.robot;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
public class Shoot {
    private Spark m_shooter;
    Random_Number m_random;


    public Shoot (int shooter) {
        m_shooter = new Spark(shooter);
        m_random = new Random_Number();
    }

    public void Shooot (boolean Bbuuton, boolean XBuuton, boolean Ybuuton) {
         if (Bbuuton) {
            m_shooter.set(-1);
        } else if (XBuuton) {
            m_shooter.set(Math.random() * -1);
        } else if (Ybuuton) {
            m_shooter.set(1);
        } else {
            m_shooter.set(0);
        }
    }
}

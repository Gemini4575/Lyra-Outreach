package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
// hi from libby
import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class Intake {
    private Spark m_intake1;
    private CANSparkMax m_intake2_advancer;



    public Intake (int intake1_in, int intake2_in) {
        m_intake1 = new Spark(intake1_in);
        m_intake2_advancer = new CANSparkMax(intake2_in, MotorType.kBrushless);
    }

    public void intake (boolean speed, boolean not_speed, boolean intake) {
        if (intake) {
            if (speed) {
                m_intake1.set(1);
                m_intake2_advancer.set(-1);
            } else if (not_speed) {
                m_intake1.set(-1);
                m_intake2_advancer.set(1);
            } else if (!speed && !not_speed) {
                m_intake1.set(0);
                m_intake2_advancer.set(0);
            }
        } else {
            m_intake1.set(0);
            m_intake2_advancer.set(0);
        }
    }

}

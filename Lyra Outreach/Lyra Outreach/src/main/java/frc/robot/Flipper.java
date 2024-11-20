package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class Flipper {
    private Spark m_flipper;
    private DigitalInput Limit;
    private double speed = 1;
    private boolean first;
    private int state = 1;

    public Flipper (int Flipper_in, int limit_in) {
        m_flipper = new Spark(Flipper_in);
        Limit = new DigitalInput(limit_in);
    }

    public void Flip (boolean Abutton) {
        if (Limit.get()) {
            first = false;
            state = 2;
        }
        
        if (Abutton) {
            first = true;
            speed = 1;
        } else if (!first && state == 2) {
            speed = speed * -1;
        } else if (Limit.get() && !first) {
            speed = speed * -1;
            state = 3;
        } else if (state == 3 && !first) {
            speed = 0;
            first = true;
            state = 1;
        }
        m_flipper.set(speed);
    }
}

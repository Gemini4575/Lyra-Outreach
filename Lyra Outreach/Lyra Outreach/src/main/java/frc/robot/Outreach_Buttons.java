package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;

public class Outreach_Buttons {
    DigitalInput Safty_Switch;
    DigitalInput Flipper_button;
    DigitalInput Intake_Shoot;

    public Outreach_Buttons (int SaftySwitch, int Flipper, int IntakeShoot) {
        Safty_Switch = new DigitalInput(SaftySwitch);
        Flipper_button = new DigitalInput(Flipper);
        Intake_Shoot = new DigitalInput(IntakeShoot);
    }

    public boolean Switch () {
        return Safty_Switch.get();
    }
    public boolean Intake () {
        return Intake_Shoot.get();
    }
    public boolean Flip () {
        return Flipper_button.get();
    }
}

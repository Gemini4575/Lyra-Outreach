package frc.robot;


public class Robot_Buttons {
    Drivetrain m_drivetrain;
    Flipper m_Flipper;
    Intake m_Intake;
    Shoot m_Shoot;
    Outreach_Buttons m_OB;
    boolean drive = false;
    boolean intake = true;
    public Robot_Buttons () {
        m_drivetrain = new Drivetrain(1, 2, 3, 4);
        m_Flipper = new Flipper(2, 9);
        m_Shoot = new Shoot(0);
        m_Intake = new Intake(1, 5);
        m_OB = new Outreach_Buttons(0, 1, 2);
    }

    public void Run (XboxHelper XB) {
        // if (m_OB.Switch()) {
        //     m_Flipper.Flip(m_OB.Flip());
        //     m_Intake.intake(m_OB.Intake(), 
        //     false, 
        //     intake);
        //     m_Shoot.Shooot(m_OB.Intake(), false, false);
        // } else {

            m_Flipper.Flip(XB.GetA());

            m_Shoot.Shooot(XB.GetB(), 
            XB.GetX(), 
            XB.GetY());

            m_Intake.intake(XB.GetRBumper(),
            XB.GetLBumper() || XB.GetB(), 
            intake);

            m_drivetrain.drive(XB.GetLYHalf(), 
            XB.GetRXHalf(), drive);

            if (XB.GetRBumperSticky() && XB.GetLBumperSticky()) {
            drive = true;
            intake = false;
            } else {
            drive = false;
            intake = true;
            }
        // }
    }
}

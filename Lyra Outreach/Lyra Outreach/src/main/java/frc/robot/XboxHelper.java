package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.math.MathUtil;

public class XboxHelper {
    private XboxController OGXbox;
    private boolean StickA;
    private boolean StickB;
    private boolean StickY;
    private boolean StickX;
    private boolean StickRBumper;
    private boolean StickLBumper;
    private double DeadBandLeft = 0.0;
    private Double DeadBandRight = 0.0;
    public XboxHelper (int port, double Deadband) {
        OGXbox = new XboxController(port);
        DeadBandLeft = Deadband;
        DeadBandRight = Deadband;
    }
    public XboxHelper (int port, double DeadbandLeft, double DeadbandRight) {
        OGXbox = new XboxController(port);
        DeadBandLeft = DeadbandLeft;
        DeadBandRight = DeadbandRight;
    }
    public Boolean GetA () {
        return OGXbox.getAButton();
    }
    public boolean GetAPrsd () {
        return OGXbox.getAButtonPressed();
    }
    public boolean GetARlsd () {
        return OGXbox.getAButtonReleased();
    }
    public boolean GetASticky () {
        if(OGXbox.getAButtonPressed()) {
            StickA = !StickA;
        }
        return StickA;
    }
    public Boolean GetB () {
        return OGXbox.getBButton();
    }
    public boolean GetBPrsd () {
        return OGXbox.getBButtonPressed();
    }
    public boolean GetBRlsd () {
        return OGXbox.getBButtonReleased();
    }
    public boolean GetBSticky () {
        if(OGXbox.getBButtonPressed()) {
            StickB = !StickB;
        }
        return StickB;
    }
    public Boolean GetX () {
        return OGXbox.getXButton();
    }
    public boolean GetXPrsd () {
        return OGXbox.getXButtonPressed();
    }
    public boolean GetXRlsd () {
        return OGXbox.getXButtonReleased();
    }
    public boolean GetXSticky () {
        if(OGXbox.getXButtonPressed()) {
            StickX = !StickX;
        }
        return StickX;
    }
    public Boolean GetY () {
        return OGXbox.getYButton();
    }
    public boolean GetYPrsd () {
        return OGXbox.getYButtonPressed();
    }
    public boolean GetYRlsd () {
        return OGXbox.getYButtonReleased();
    }
    public boolean GetYSticky () {
        if(OGXbox.getYButtonPressed()) {
            StickY = !StickY;
        }
        return StickY;
    }
    public Boolean GetRBumper () {
        return OGXbox.getRightBumper();
    }
    public boolean GetRBumperPrsd () {
        return OGXbox.getRightBumperPressed();
    }
    public boolean GetRBumperRlsd () {
        return OGXbox.getRightBumperReleased();
    }
    public boolean GetRBumperSticky () {
        if(OGXbox.getRightBumperPressed()) {
            StickRBumper = !StickRBumper;
        }
        return StickRBumper;
    }
    public Boolean GetLBumper () {
        return OGXbox.getLeftBumper();
    }
    public boolean GetLBumperPrsd () {
        return OGXbox.getLeftBumperPressed();
    }
    public boolean GetLBumperRlsd () {
        return OGXbox.getLeftBumperReleased();
    }
    public boolean GetLBumperSticky () {
        if(OGXbox.getLeftBumperPressed()) {
            StickLBumper = !StickLBumper;
        }
        return StickLBumper;
    }
    public double GetRX () {
        return MathUtil.applyDeadband(OGXbox.getRightX(), DeadBandRight);
    }
    public double GetRXHalf () {
        return MathUtil.applyDeadband(OGXbox.getRightX() * 0.5, DeadBandRight);
    }
    public double GetRXQuarter () {
        return MathUtil.applyDeadband(OGXbox.getRightX() * 0.25, DeadBandRight);
    }
    public double GetRY () {
        return MathUtil.applyDeadband(OGXbox.getRightY(), DeadBandRight);
    }
    public double GetRYHalf () {
        return MathUtil.applyDeadband(OGXbox.getRightY() * 0.5, DeadBandRight);
    }
    public double GetRYQuarter () {
       return MathUtil.applyDeadband(OGXbox.getRightY() * 0.25, DeadBandRight);
    }
    public double GetLX () {
        return MathUtil.applyDeadband(OGXbox.getLeftX(), DeadBandLeft);
    }
    public double GetLXHalf () {
        return MathUtil.applyDeadband(OGXbox.getLeftX() * 0.5, DeadBandLeft);
    }
    public double GetLXQuarter () {
        return MathUtil.applyDeadband(OGXbox.getLeftX() * 0.25, DeadBandLeft);
    }
    public double GetLY () {
        return MathUtil.applyDeadband(OGXbox.getLeftY(), DeadBandLeft);
    }
    public double GetLYHalf () {
        return MathUtil.applyDeadband(OGXbox.getLeftY() * 0.5, DeadBandLeft);
    }
    public double GetLYQuarter () {
        return MathUtil.applyDeadband(OGXbox.getLeftY() * 0.25, DeadBandLeft);
    }
}
package frc.robot;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class Drivetrain {
  private final CANSparkMax m_leftMotor1;
  private final CANSparkMax m_leftMotor2;
  private final CANSparkMax m_rightMotor1;
  private final CANSparkMax m_rightMotor2;

  private DifferentialDrive m_robotDrive;

  // We need to invert one side of the drivetrain so that positive voltages
  // result in both sides moving forward. Depending on how your robot's
  // gearbox is constructed, you might have to invert the left side instead.

  public Drivetrain (int left1, int left2, int right1, int right2) {
    m_rightMotor1 = new CANSparkMax(right1, MotorType.kBrushless);
    m_rightMotor2 = new CANSparkMax(right2, MotorType.kBrushless);
    m_leftMotor1 = new CANSparkMax(left1, MotorType.kBrushless);
    m_leftMotor2 = new CANSparkMax(left2, MotorType.kBrushless);

    m_rightMotor1.setInverted(true);
    m_rightMotor2.setInverted(true);

    m_rightMotor2.follow(m_rightMotor1);
    m_leftMotor2.follow(m_leftMotor1);

    m_robotDrive = new DifferentialDrive(m_leftMotor1::set, m_rightMotor1::set);
  }

  public void drive (double speed, double rot, boolean drive) {
    if(drive){
        m_robotDrive.arcadeDrive(speed, rot);
    } else if (!drive) {
        speed = 0;
        rot = 0;
    }
  }
}

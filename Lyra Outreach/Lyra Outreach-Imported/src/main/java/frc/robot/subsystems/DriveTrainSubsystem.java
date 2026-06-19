package frc.robot.subsystems;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrainSubsystem extends SubsystemBase {
    private final SparkMax m_leftMotor1;
  private final SparkMax m_leftMotor2;
  private final SparkMax m_rightMotor1;
  private final SparkMax m_rightMotor2;

  private DifferentialDrive m_robotDrive;
    

  public DriveTrainSubsystem(){
    m_rightMotor1 = new SparkMax(3, MotorType.kBrushed);
    m_rightMotor2 = new SparkMax(4, MotorType.kBrushed);
    m_leftMotor1 = new SparkMax(1, MotorType.kBrushed);
    m_leftMotor2 = new SparkMax(2, MotorType.kBrushed);

    SparkMaxConfig rightLeaderConfig = new SparkMaxConfig();
    SparkMaxConfig rightFollowerConfig = new SparkMaxConfig();
    SparkMaxConfig leftFollowerConfig = new SparkMaxConfig();

    rightLeaderConfig.inverted(true);
    rightFollowerConfig.follow(m_rightMotor1);
    leftFollowerConfig.follow(m_leftMotor1);

    m_rightMotor1.configure(
        rightLeaderConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    m_rightMotor2.configure(
        rightFollowerConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    m_leftMotor2.configure(
        leftFollowerConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);

    m_robotDrive = new DifferentialDrive(m_leftMotor1::set, m_rightMotor1::set);
  }

  public void drive(double forwardSpeed, double turnSpeed){
    m_robotDrive.arcadeDrive(forwardSpeed, turnSpeed);
  }
}

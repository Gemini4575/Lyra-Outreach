// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.wpilibj.TimedRobot;
public class Robot extends TimedRobot {
  XboxHelper XB;
  Robot_Buttons RB;
  @Override
  public void robotInit() {
    RB = new Robot_Buttons();
    XB = new XboxHelper(0, 0);
  }
  @Override
  public void teleopPeriodic() {
    RB.Run(XB);
  }
}


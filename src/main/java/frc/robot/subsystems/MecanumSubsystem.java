// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.robot.Constants;

public class MecanumSubsystem extends SubsystemBase {
  private MecanumDrive m_mecanumDrive;
  private VictorSP m_frontLeftMotor;
  private VictorSP m_rearLeftMotor;
  private VictorSP m_frontRightMotor;
  private VictorSP m_rearRightMotor;

  /** Creates a new MecanumSubsystem. */
  public MecanumSubsystem() {
    m_frontLeftMotor = new VictorSP(Constants.DriveConstants.frontLeftMotorPort);
    m_rearLeftMotor = new VictorSP(1);
    m_frontRightMotor = new VictorSP(2);
    m_rearRightMotor = new VictorSP(3);
    m_mecanumDrive = new MecanumDrive(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);
  }

  public void move(double x, double y, double rotation) {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

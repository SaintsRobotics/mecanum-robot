// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.util.sendable.Sendable;

public class MecanumSubsystem extends SubsystemBase {
  private MecanumDrive m_mecanumDrive;
  private WPI_VictorSPX m_frontLeftMotor;
  private WPI_VictorSPX m_rearLeftMotor;
  private WPI_VictorSPX m_frontRightMotor;
  private WPI_VictorSPX m_rearRightMotor;

  /** Creates a new MecanumSubsystem. */
  public MecanumSubsystem() {
    m_frontLeftMotor = new WPI_VictorSPX(Constants.DriveConstants.FRONT_LEFT_MOTOR_PORT);
    m_rearLeftMotor = new WPI_VictorSPX(Constants.DriveConstants.REAR_LEFT_MOTOR_PORT);
    m_frontRightMotor = new WPI_VictorSPX(Constants.DriveConstants.FRONT_RIGHT_MOTOR_PORT);
    m_rearRightMotor = new WPI_VictorSPX(Constants.DriveConstants.REAR_RIGHT_MOTOR_PORT);
    m_mecanumDrive = new MecanumDrive(m_frontLeftMotor, m_rearLeftMotor, m_frontRightMotor, m_rearRightMotor);
  }

  public void setSpeed(double x_speed, double y_speed, double z_rotation) {
    m_mecanumDrive.driveCartesian(y_Speed, x_Speed, z_Rotation);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }
}

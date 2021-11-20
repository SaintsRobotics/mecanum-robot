// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TheBestMecanumSubsystemEver extends SubsystemBase {
  /** Creates a new TheBestMecanumSubsystemEver. */
  WPI_VictorSPX TopRightMotor;
  WPI_VictorSPX TopLeftMotor;
  WPI_VictorSPX BottomRightMotor;
  WPI_VictorSPX BottomLeftMotor;

  MecanumDrive drive;

  // The constructer inherits motors and assigns them to the motor variables that
  // were created above.
  public TheBestMecanumSubsystemEver() {
    frontLeftMotor = new WPI_VictorSPX(Constants.DriveConstants.FRONT_LEFT_MOTOR_PORT);
    rearLeftMotor = new WPI_VictorSPX(Constants.DriveConstants.REAR_LEFT_MOTOR_PORT);
    frontRightMotor = new WPI_VictorSPX(Constants.DriveConstants.FRONT_RIGHT_MOTOR_PORT);
    rearRightMotor = new WPI_VictorSPX(Constants.DriveConstants.REAR_RIGHT_MOTOR_PORT);
    mecanumDrive = new MecanumDrive(m_frontLeftMotor, m_rearLeftMotor, m_frontRightMotor, m_rearRightMotor);
    TopRightMotor = frontRightMotor;
    TopLeftMotor = frontLeftMotor;
    BottomRightMotor = rearRightMotor;
    BottomLeftMotor = rearLeftMotor;
    drive = new MecanumDrive(TopLeftMotor, BottomLeftMotor, TopRightMotor, BottomRightMotor);
  }

  public void setSpeed(double x_speed, double y_speed, double z_rotation) {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

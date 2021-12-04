// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.HardwareMap.MecanumDriveHardware;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;


public class MecanumDriveSubsystem extends SubsystemBase {
  /** Creates a new MecanumDriveSubsystem. */
  // private WPI_VictorSPX m_FrontRight, m_FrontLeft, m_BackRight, m_BackLeft;
  // private MecanumDrive Mecanum;
  private MecanumDrive m_mecanumDrive;
  private WPI_VictorSPX m_frontLeftMotor;
  private WPI_VictorSPX m_rearLeftMotor;
  private WPI_VictorSPX m_frontRightMotor;
  private WPI_VictorSPX m_rearRightMotor;
  

  public MecanumDriveSubsystem(MecanumDriveHardware hardware) { 
    // m_FrontLeft = hardware.FrontLeft; 
    // m_FrontRight = hardware.FrontRight; 
    // m_BackRight = hardware.BackRight;  
    // m_BackLeft = hardware.BackLeft; 
    
    // Mecanum = new MecanumDrive(m_FrontLeft, m_BackLeft, m_FrontRight, m_BackRight);

    m_frontLeftMotor = new WPI_VictorSPX(Constants.DriveConstants.FRONT_LEFT_MOTOR_PORT);
    m_rearLeftMotor = new WPI_VictorSPX(Constants.DriveConstants.REAR_LEFT_MOTOR_PORT);
    m_frontRightMotor = new WPI_VictorSPX(Constants.DriveConstants.FRONT_RIGHT_MOTOR_PORT);
    m_rearRightMotor = new WPI_VictorSPX(Constants.DriveConstants.REAR_RIGHT_MOTOR_PORT);
    m_mecanumDrive = new MecanumDrive(m_frontLeftMotor, m_rearLeftMotor, m_frontRightMotor, m_rearRightMotor);


    
    
    
    
  
  
    


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

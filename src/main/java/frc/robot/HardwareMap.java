package frc.robot;


import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class HardwareMap {


    public class MecanumDriveHardware{

        public WPI_VictorSPX FrontRight; 
        public WPI_VictorSPX BackRight; 
        public WPI_VictorSPX FrontLeft; 
        public WPI_VictorSPX BackLeft; 

        public MecanumDriveHardware(){
            FrontRight = new WPI_VictorSPX(1);
            BackRight = new WPI_VictorSPX(2);
            FrontLeft = new WPI_VictorSPX(3);
            BackLeft = new WPI_VictorSPX(4);




        }


    }



    public MecanumDriveHardware hardware = new MecanumDriveHardware();

    public HardwareMap(){

    }
    
}

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.util.ElapsedTime;

public enum LevelEnum {base, terminal, low, medium, high};

public final double BASE_LEVEL = 0.0;
public final double TERMINAL_LEVEL = 0.0;
public final double LOW_LEVEL = 0.0;
public final double MEDIUM_LEVEL = 0.0;
public final double HIGH_LEVEL = 0.0;



public class Tower extends Thread {
    public DcMotor r_tower = null;
    public DcMotor l_tower = null;
    public bool finished = false;
    public Tower(DcMotor right, DcMotor left, Telemetry telemetry) {
        this.telemetry = telemetry;
        this.setname("tower");

        r_tower = right;
        r_tower.setDirection(DcMotor.Direction.FORWARD);
        r_tower.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        r_tower.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        r_tower.setPower(0);

        l_tower = left;
        l_tower.setDirection(DcMotor.Direction.BACKWARD); //TODO: find out which one goes which way
        l_tower.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        l_tower.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        l_tower.setPower(0);
    }


    public void raise() {}

    public void lower() {}

    @Override
    public void run() {
        try {
            while (! isInterrupted()) {
                // 
            }
        }

        catch (InterruptedException e) {
            Logging.log("%s interrupted", this.getName());
            telemetry.addData("tower thread killed");
        }

        catch (Exception e) {
            e.printStackTrace(Logging.logPrintStream);
            telemetry.addData("unhandeled exception occurred");
        }
    }
}
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import SleeveDetection;

@Autonomous(name= "Pushbot: Auto Drive By Time", group= "Pushbot")
public class DriveByTimeAuton extends LinearOpMode {

    HardwarePushbot robot = new HardwarePushbot();
    private ElapsedTime runtime = new ElapsedTime();

    public SleeveDetection.ParkingPosition targetPos = null;

    @Override
    public void runOpMode(){
        robot.init(hardwareMap);
        targetPos = SleeveDetection.getPosition();

        telemetry.addData("Status", "Ready to Run");
        telemetry.update();

        waitForStart();
        robot.blDrive.setPower(HardwarePushbot.MAX_SPEED);
        robot.brDrive.setPower(HardwarePushbot.MAX_SPEED);
        robot.flDrive.setPower(HardwarePushbot.MAX_SPEED);
        robot.frDrive.setPower(HardwarePushbot.MAX_SPEED);
        runtime.reset();

        while(opModeIsActive() && (runtime.seconds() <0.5)){
            telemetry.addData("Path", "Leg 3: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        runtime.reset();

        while (opModeIsActive() && (runtime.seconds() <0.5)){
            telemetry.addData("Path", "Leg 3: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }


/*
                robot.blDrive.setPower(HardwarePushbot.MAX_SPEED);
                robot.brDrive.setPower(HardwarePushbot.MAX_SPEED);
                robot.flDrive.setPower(HardwarePushbot.MAX_SPEED);
                robot.frDrive.setPower(HardwarePushbot.MAX_SPEED);
                runtime.reset();
                while(opModeIsActive() && (runtime.seconds() <0.5)){
                        telemetry.addData("Path", "Leg 3: %2.5f S Elapsed", runtime.seconds());
                        telemetry.update();
                }
                robot.blDrive.setPower(-HardwarePushbot.MAX_SPEED);
                robot.brDrive.setPower(-HardwarePushbot.MAX_SPEED);
                robot.flDrive.setPower(-HardwarePushbot.MAX_SPEED);
                robot.frDrive.setPower(-HardwarePushbot.MAX_SPEED);
                runtime.reset();
                while (opModeIsActive() && (runtime.seconds() < 1.0)) {
                        telemetry.addData("Path", "Leg 3: %2.5f S Elapsed", runtime.seconds());
                        telemetry.update();
                }
                robot.blDrive.setPower(0);
                robot.brDrive.setPower(0);
                robot.flDrive.setPower(0);
                robot.frDrive.setPower(0);
                telemetry.addData("Status", "Path Complete");
                telemetry.update();
                sleep(1000);
*/
    }

}
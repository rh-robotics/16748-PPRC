public class Drive {
    private HardwarePushbot hardware;
    private Telemetry telemetry;
    public bool drivestate;
    public Drive(HardwarePushbot hardware) {
        super();
        this.hardware = hardware;
    }
    
    public manualDrive(Gamepad gamepad) {
        double strafe_Y = gamepad.left_stick_y; // forward is pos, backward is neg. (-1 <= magnitude <= 1)
        double strafe_X = -gamepad.right_stick_x; //right is pos, left is neg. (-1 <= magnitude <= 1)

        double blStrafePwr = (strafe_X+strafe_Y);
        double brStrafePwr = -(strafe_X-strafe_Y);
        double flStrafePwr = -(strafe_X-strafe_Y);
        double frStrafePwr = (strafe_X+strafe_Y);

        double rotate = gamepad1.left_stick_x;

        //Counter clockwise is positive (right joystick), Counter is neg (joystick left?)

        if (strafe_Y==0 && strafe_X==0) {
            robot.blDrive.setPower(rotate);
            robot.brDrive.setPower(-rotate);
            robot.flDrive.setPower(rotate);
            robot.frDrive.setPower(-rotate);
        }
        else {
            robot.blDrive.setPower(blStrafePwr);
            robot.brDrive.setPower(brStrafePwr);
            robot.flDrive.setPower(flStrafePwr);
            robot.frDrive.setPower(frStrafePwr);
        }

        //telemetry.addData("Motors driving? ", )
        telemetry.update();


    }
    public stopdrive
}

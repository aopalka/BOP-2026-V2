package frc.robot;

import com.ctre.phoenix6.CANBus;

public final class Ports {
    // CAN Buses
    public static final CANBus kRoboRioCANBus = new CANBus("rio");
    public static final CANBus kCANivoreCANBus = new CANBus("main");

    // Talon FX IDs
    public static final int kIntakePivot = 30;
    public static final int kIntakeRollers = 31;
    public static final int kFloor = 32;
    public static final int kFeeder = 33;
    public static final int kShooterLeft = 34;
    public static final int kShooterMiddle = 35;
    public static final int kShooterRight = 36;
    public static final int kHanger = 38;

    // PWM Ports
    public static final int kHoodLeftServo = 3;
    public static final int kHoodRightServo = 4;
}

package frc.robot.util;
import java.util.function.DoubleSupplier;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.VecBuilder;
import edu.wpi.first.math.Vector;
import edu.wpi.first.math.numbers.N2;

public class ManualDriveInput {
    public final double forward;
    public final double left;
    public final double rotation;

    public ManualDriveInput(double forward, double left, double rotation) {
        this.forward = forward;
        this.left = left;
        this.rotation = rotation;
    }

    public ManualDriveInput() {
        this(0, 0, 0);
    }

    public boolean hasTranslation() {
        return Math.hypot(forward, left) > 0;
    }

    public boolean hasRotation() {
        return Math.abs(rotation) > 0;
    }
}

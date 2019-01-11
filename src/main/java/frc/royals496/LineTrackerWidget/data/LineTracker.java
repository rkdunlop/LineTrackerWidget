package frc.royals496.LineTrackerWidget.data;

import edu.wpi.first.shuffleboard.api.data.ComplexData;

import java.util.Map;

public final class LineTracker extends ComplexData<LineTracker> {
    private boolean left, center, right;
    public LineTracker(boolean left, boolean center, boolean right) {

        this.left = left;
        this.center = center;
        this.right = center;
    }

    @Override
    public Map<String, Object> asMap() {
        return Map.of("left", left, "center", center, "right", right);
    }
}

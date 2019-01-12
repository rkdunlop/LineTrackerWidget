package frc.royals496.LineTrackerWidget.data;

import edu.wpi.first.shuffleboard.api.data.ComplexData;
import edu.wpi.first.shuffleboard.api.util.Maps;

import java.util.Map;

public final class LineTracker extends ComplexData<LineTracker> {
    private boolean left, center, right;
    public LineTracker(boolean left, boolean center, boolean right) {

        this.left = left;
        this.center = center;
        this.right = right;
    }

    public boolean getLeft() {
        return left;
    }

    public boolean getCenter() {
        return center;
    }

    public boolean getRight() {
        return right;
    }

    @Override
    public Map<String, Object> asMap() {
        return Maps.<String, Object>builder()
                .put("left", left)
                .put("center", center)
                .put("right", right)
                .build();
    }
}

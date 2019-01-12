package frc.royals496.LineTrackerWidget.data.type;

import edu.wpi.first.shuffleboard.api.data.ComplexDataType;
import edu.wpi.first.shuffleboard.api.util.Maps;
import frc.royals496.LineTrackerWidget.data.LineTracker;

import java.util.Map;
import java.util.function.Function;

public class LineTrackerType extends ComplexDataType<LineTracker> {

    private static final String TYPE_NAME = "LineTracker";

    public static  final LineTrackerType Instance = new LineTrackerType();

    public LineTrackerType() {
        super(TYPE_NAME, LineTracker.class);
    }

    @Override
    public Function<Map<String, Object>, LineTracker> fromMap() {
        return map -> new LineTracker(
                Maps.getOrDefault(map, "left", false),
                Maps.getOrDefault(map, "center", false),
                Maps.getOrDefault(map, "right", false)
        );
    }

    @Override
    public LineTracker getDefaultValue() {
        return new LineTracker(false,false,false);
    }
}

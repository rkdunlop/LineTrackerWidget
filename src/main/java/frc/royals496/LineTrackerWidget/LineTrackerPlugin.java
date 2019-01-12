package frc.royals496.LineTrackerWidget;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.data.DataType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;

import frc.royals496.LineTrackerWidget.data.type.LineTrackerType;
import frc.royals496.LineTrackerWidget.widget.LineTrackerWidget;

import java.util.List;
import java.util.Map;

@Description(
        group = "frc.royals496",
        name = "LineTrackerWidget",
        version ="2019.0.1",
        summary = "Line tracker plugin "
)
public class LineTrackerPlugin extends Plugin {

    @Override
    public List<DataType> getDataTypes() {
        return ImmutableList.of(
                LineTrackerType.Instance
        );
    }

    @Override
    public List<ComponentType> getComponents() {
        return ImmutableList.of(
                WidgetType.forAnnotatedWidget(LineTrackerWidget.class)
        );

    }

    @Override
    public Map<DataType, ComponentType> getDefaultComponents() {
        return ImmutableMap.of(
                LineTrackerType.Instance, WidgetType.forAnnotatedWidget(LineTrackerWidget.class)
        );
    }

}

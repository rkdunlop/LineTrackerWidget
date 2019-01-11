package frc.royals496.LineTrackerWidget.widget;

import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import frc.royals496.LineTrackerWidget.data.LineTracker;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

@Description(
        name = "Line Tracker",
        dataTypes = LineTracker.class,
        summary = "Displays line trackers status left, center , right"
)
@ParametrizedController("LineTrackerWidget.fxml")
public class LineTrackerWidget extends SimpleAnnotatedWidget<LineTracker> {

    @FXML
    private Pane root;
    @FXML
    private Label left;
    @FXML
    private Label center;
    @FXML
    private Label right;

    @FXML
    private void initialize() {
        left.textProperty().bind(dataOrDefault.map(  ))
    }
    @Override
    public Pane getView() {
        return root;
    }
}

package frc.royals496.LineTrackerWidget.widget;

import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import frc.royals496.LineTrackerWidget.data.LineTracker;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

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
    private Circle left;
    @FXML
    private Circle center;
    @FXML
    private Circle right;

    @FXML
    private void initialize() {

        left.fillProperty().bind(
                dataOrDefault
                        .map(LineTracker::getLeft)
                        .map(this::getColor)
        );

        center.fillProperty().bind(
                dataOrDefault
                        .map(LineTracker::getCenter)
                        .map(this::getColor)
        );

        right.fillProperty().bind(
                dataOrDefault
                        .map(LineTracker::getRight)
                        .map(this::getColor)
        );




    }
    @Override
    public Pane getView() {
        return root;
    }

    private Paint getColor(boolean b) {
        if(b){
            return Paint.valueOf("green");

        }
        return Paint.valueOf("red");
    }
}

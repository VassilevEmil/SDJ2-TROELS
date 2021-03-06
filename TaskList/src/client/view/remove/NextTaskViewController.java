package client.view.remove;

import client.core.ViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class NextTaskViewController {
    @FXML
    private Label nextTaskLabel;
    @FXML
    private Label createdByLabel;
    @FXML
    private Label createdAtLabel;

    private NextTaskViewModel nextTaskViewModel;
    private ViewHandler viewHandler;

    public void init(NextTaskViewModel nextTaskViewModel, ViewHandler viewHandler) {
        this.viewHandler = viewHandler;
        this.nextTaskViewModel = nextTaskViewModel;
        nextTaskViewModel.setAllLabels();
        nextTaskLabel.textProperty().bind(nextTaskViewModel.nextTaskProperty());
        createdByLabel.textProperty().bind(nextTaskViewModel.createdByProperty());
        createdAtLabel.textProperty().bind(nextTaskViewModel.createdAtProperty());
    }

    @FXML
    private void onGetTaskButton(ActionEvent actionEvent) {
        nextTaskViewModel.removeFirstTask();
        nextTaskViewModel.clear();
    }

    @FXML
    private void onBackButton(ActionEvent actionEvent) {
        viewHandler.openAllTasksView();
    }
}

package application;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class projectsEstimateController implements Initializable {

	@FXML
	public ListView<String> lstProjects;

	@FXML
	public Button btnAdd;

	@FXML
	public Button btnEdit;

	@FXML
	public Button btnDelete;

	@FXML
	public Button btnOpen;

	public Optional<String> result;

	ObservableList<String> list = FXCollections.observableArrayList();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lstProjects.setItems(list);
	}

	public void addProjectEstimate(ActionEvent event) {
		TextInputDialog dialog = new TextInputDialog();
		dialog.setTitle("Construction Cost Estimate - Enter name of the project.");
		dialog.setHeaderText("Project Name");
		dialog.setContentText("Please enter name for the project:");
		Stage stage = (Stage) dialog.getDialogPane().getScene().getWindow();
		stage.getIcons().add(new Image(this.getClass().getResource("icon.png").toString()));
		result = dialog.showAndWait();
		String sresult = result.get().trim();
		lstProjects.getItems().add(sresult);
	}

	public void selectProjectEstimate(MouseEvent event) {
	    if (lstProjects.getSelectionModel().getSelectedItem() == null){
	    } else {
	    btnEdit.setDisable(false);
	    btnEdit.setDisable(false);
	    btnDelete.setDisable(false);
	    btnOpen.setDisable(false);
	    }
	}

	public void editProjectEstimate(ActionEvent event) {
		TextInputDialog dialog = new TextInputDialog(lstProjects.getSelectionModel().getSelectedItem());
		dialog.setTitle("Construction Cost Estimate - Edit name of the project.");
		dialog.setHeaderText("Edit Project Name");
		dialog.setContentText("Please enter name for the project:");
		Stage stage = (Stage) dialog.getDialogPane().getScene().getWindow();
		stage.getIcons().add(new Image(this.getClass().getResource("icon.png").toString()));
		result = dialog.showAndWait();
		String sresult = result.get().trim();
		lstProjects.getItems().set(lstProjects.getSelectionModel().getSelectedIndex(),sresult);
	}

	public void deleteProjectEstimate(ActionEvent event) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
		stage.getIcons().add(new Image(this.getClass().getResource("icon.png").toString()));
		alert.setTitle("Construction Cost Estimate - Delete project.");
		alert.setHeaderText("Delete Project");
		alert.setContentText("Are you sure to delete this project?");

		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK){
			lstProjects.getItems().remove(lstProjects.getSelectionModel().getSelectedIndex());
		}
	}

	public void openProjectEstimate(ActionEvent event) throws Exception{
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/signinPayroll.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Payroll Management System - Please sign in to continue.");
		primaryStage.getIcons().add(new Image("/application/icon.png"));
		primaryStage.show();
	}

}

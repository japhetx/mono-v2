package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class signinEstimateController {

	@FXML
	private Label lblStatus;

	@FXML
	private TextField txtUsername;

	@FXML
	private TextField txtPassword;

	public void Signin(ActionEvent event) {
		if (txtUsername.getText().equals("user")&& txtPassword.getText().equals("pass")) {
			// New stage here
			Alert alert = new Alert(AlertType.INFORMATION);
			Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
			stage.getIcons().add(new Image(this.getClass().getResource("icon.png").toString()));
			alert.setTitle("Construction Cost Estimate - Sign Success	");
			alert.setHeaderText("Sign in Success");
			alert.setContentText("Press OK to continue...");

			alert.showAndWait();
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
			stage.getIcons().add(new Image(this.getClass().getResource("icon.png").toString()));
			alert.setTitle("Construction Cost Estimate - Sign Error	");
			alert.setHeaderText("Sign in Error");
			alert.setContentText("Invalid Username and Password...");

			alert.showAndWait();
		}
	}


}

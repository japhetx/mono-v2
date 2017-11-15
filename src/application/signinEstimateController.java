package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class signinEstimateController {

	@FXML
	private TextField txtUsername;

	@FXML
	private TextField txtPassword;

	public static Stage projectswindow;

	public void SigninEstimate(ActionEvent event) throws Exception {
		if (txtUsername.getText().equals("user")&& txtPassword.getText().equals("pass")) {
			Main.mainWindow.close();
			welcomeController.signinWindow.close();
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/projectsEstimate.fxml"));
			Scene scene = new Scene(root);
			projectswindow = primaryStage;
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.setTitle("Payroll Management System");
			primaryStage.getIcons().add(new Image("/application/icon.png"));
			primaryStage.show();


		} else {
			Alert alert = new Alert(AlertType.ERROR);
			Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
			stage.getIcons().add(new Image(this.getClass().getResource("icon.png").toString()));
			alert.setTitle("Payroll Management System");
			alert.setHeaderText("Sign in Error");
			alert.setContentText("Invalid Username and Password...");

			alert.showAndWait();
		}
	}


}

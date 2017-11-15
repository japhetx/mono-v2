package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class welcomeController {

	public static Stage signinWindow;

	public void showLoginEstimate(ActionEvent event) throws Exception{
		Stage primaryStage = new Stage();
		signinWindow = primaryStage;
		Parent root = FXMLLoader.load(getClass().getResource("/application/signinEstimate.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Construction Cost Estimate - Create or choose project.");
		primaryStage.getIcons().add(new Image("/application/icon.png"));
		primaryStage.show();
	}

	public void showLoginPayroll(ActionEvent event ) throws Exception{
		Stage primaryStage = new Stage();
		signinWindow = primaryStage;
		Parent root = FXMLLoader.load(getClass().getResource("/application/signinPayroll.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Payroll Management System - Please sign in to continue.");
		primaryStage.getIcons().add(new Image("/application/icon.png"));
		primaryStage.show();
	}

}

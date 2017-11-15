package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class welcomeController {

	public void showLoginEstimate(ActionEvent event ) throws Exception{
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/signin.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("signin.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Please sign in to continue");
		primaryStage.getIcons().add(new Image("/application/icon.png"));
		primaryStage.show();
	}

	public void showLoginPayroll(ActionEvent event ) throws Exception{
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/signin.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("signin.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Please sign in to continue");
		primaryStage.getIcons().add(new Image("/application/icon.png"));
		primaryStage.show();
	}

}

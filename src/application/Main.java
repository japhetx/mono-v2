package application;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Main extends Application {

	public static Stage mainWindow;

	@Override
	public void start(Stage primaryStage) {
		try {
			mainWindow = primaryStage;
			Parent root = FXMLLoader.load(getClass().getResource("/application/welcome.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.setTitle("Edres Construction & Supply");
			primaryStage.getIcons().add(new Image("/application/icon.png"));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

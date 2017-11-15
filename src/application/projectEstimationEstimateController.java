package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class projectEstimationEstimateController {

	@FXML
	public Button btnProject;

	@FXML
	public Button btnEstimate;

	@FXML
	public Button btnCostbook;

	@FXML
	public Button btnReport;

	public void showProject(ActionEvent event) throws Exception{
		projectsEstimateController.window.setScene(projectsEstimateController.scene1);
	}

	public void showEstimate(ActionEvent event) throws Exception{
		projectsEstimateController.window.setScene(projectsEstimateController.scene2);
	}

	public void showCostbook(ActionEvent event) throws Exception{
		projectsEstimateController.window.setScene(projectsEstimateController.scene3);
	}

	public void showReport(ActionEvent event) throws Exception{
		projectsEstimateController.window.setScene(projectsEstimateController.scene4);
	}

}

package application;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();


			root.getChildren().add(new Label("Ran's label"));
			root.getChildren().add(new Label("Ran's branch"));
			root.getChildren().add(new Label("Ran's branch2"));



			root.getChildren().add(new Label("Arush's label"));

			
			root.getChildren().add(new Label("Arush's branch"));
			

			root.getChildren().add(new Label("Saja's branch"));

			root.getChildren().add(new Label("Saja's branch2"));

			Scene scene = new Scene(root, 400, 400);
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Saja's project");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

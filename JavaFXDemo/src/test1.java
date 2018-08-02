//import java.awt.Button;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

//stage
// scene
//  layout
public class test1 extends Application{
	public static void main(String[] args) {
        launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn1 = new Button("Press here");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				System.out.println("My first application");
			}
		});
		
		
		// Create Layout
		StackPane root = new StackPane();
		root.getChildren().add(btn1);
		Scene scene = new Scene(root, 500, 300);
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}
}

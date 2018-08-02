//import java.awt.Button;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

//stage
// scene
//  layout
public class test2 extends Application{
	public static void main(String[] args) {
        launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn1 = new Button("Press here");
		Button btn2 = new Button("Exit");
		
		//btn2.setOnAction(e -> System.out.println("Exit"));
		//btn2.setOnAction(e -> System.exit(0));	// Lambda expression
		btn2.setOnAction(e -> {
		    System.out.println("Exit");
			System.exit(0);
		});
		
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				System.out.println("My first application");
			}
		});
		
		
		// Create Layout
		VBox root = new VBox();
		root.getChildren().addAll(btn2, btn1);
		Scene scene = new Scene(root, 500, 300);
		
		primaryStage.setTitle("Maksym 1st application");
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}
}

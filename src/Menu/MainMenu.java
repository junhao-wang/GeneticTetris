package Menu;


 
import javafx.geometry.Insets;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
 
public class MainMenu extends Application {
    
    public static final int NUM_OF_BTNS = 3;
    
	
	private Button[] init_btns(){
    	Button[] btns = new Button[NUM_OF_BTNS];
    	 Button play_btn = new Button();
         play_btn.setText("Play");
         btns[0] = play_btn;
         
         
         
         Button AI_btn = new Button();
         AI_btn.setText("Demonstrate AI");
         btns[1] = AI_btn;
         
         Button quit_btn = new Button();
         quit_btn.setText("QUIT");
         btns[2] = quit_btn;
    	return btns;
    }
	
	private VBox createPane(Button[] allBtns) {
		VBox vbox = new VBox();
	    vbox.setPadding(new Insets(10));
	    vbox.setSpacing(8);
	    
	    for (int i = 0; i < allBtns.length;i++) {
	    	allBtns[i].setPrefSize(200, 50);
        	vbox.getChildren().add(allBtns[i]);
        }
	    return vbox;
	}
    
    public void start(Stage primaryStage) {
        
        
        
        
        
        
        
        Button[] allBtns = init_btns();
        VBox root = createPane(allBtns);
        
        
        
        

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Main Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 public static void main(String[] args) {
        launch(args);
    }
}



package UI;


 
import javafx.geometry.Insets;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
 
public class MainMenu extends Application {
    
    private static final int NUM_OF_BTNS = 3;
    private static final double BTN_WIDTH = 300;
    private static final double BTN_LENGTH = 50;
    private static final double SCENE_WIDTH = 300;
    private static final double SCENE_LENGTH = 200;
    
    private Stage mainStage;
    private MainMenu self;
    
    
	
	private Button[] init_btns(){
    	Button[] btns = new Button[NUM_OF_BTNS];
    	 Button play_btn = new Button();
         play_btn.setText("Play");
         play_btn.setOnAction(new EventHandler<ActionEvent>() {
        	 
             @Override
             public void handle(ActionEvent event) {
                 hideMenu();
                 PlayUI gameboard = new PlayUI();
                 gameboard.parent = self;
                 gameboard.start();
             }
         });
         btns[0] = play_btn;

         Button AI_btn = new Button();
         AI_btn.setText("Demonstrate AI");
         AI_btn.setOnAction(new EventHandler<ActionEvent>() {
        	 
             @Override
             public void handle(ActionEvent event) {
                 System.exit(0);
             }
         });
         btns[1] = AI_btn;
         
         
         Button quit_btn = new Button();
         quit_btn.setText("QUIT");
         quit_btn.setOnAction(new EventHandler<ActionEvent>() {
        	 
             @Override
             public void handle(ActionEvent event) {
                 System.exit(0);
             }
         });
         btns[2] = quit_btn;
         
         
    	return btns;
    }
	
	private VBox createPane(Button[] allBtns) {
		VBox vbox = new VBox();
	    vbox.setPadding(new Insets(10));
	    vbox.setSpacing(8);
	    
	    for (int i = 0; i < allBtns.length;i++) {
	    	allBtns[i].setPrefSize(BTN_WIDTH,  BTN_LENGTH);
        	vbox.getChildren().add(allBtns[i]);
        }
	    return vbox;
	}
    
    public void start(Stage primaryStage) {   
    	self = this;
        Button[] allBtns = init_btns();
        VBox root = createPane(allBtns);       
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_LENGTH);

        primaryStage.setTitle("Main Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
        mainStage = primaryStage;
    }
    
    public void hideMenu() {
    	mainStage.hide();
    }
    
    public void showMenu() {
    	mainStage.show();
    }
 public static void main(String[] args) {
        launch(args);
    }
}



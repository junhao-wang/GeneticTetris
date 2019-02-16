package UI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class PlayUI extends Application{
	private static final int NUM_OF_BTNS=2;
	private static final double BTN_WIDTH = 300;
	private static final double BTN_LENGTH = 50;
    private static final double SCENE_WIDTH = 300;
    private static final double SCENE_LENGTH = 200;
	public MainMenu parent;
	private Stage mainStage;
	
	private Button[] init_btns(){
    	Button[] btns = new Button[NUM_OF_BTNS];
    	 Button return_btn = new Button();
         return_btn.setText("Return to Main Menu");
         return_btn.setOnAction(new EventHandler<ActionEvent>() {
        	 
             @Override
             public void handle(ActionEvent event) {
                 mainStage.close();
                 parent.showMenu();
             }
         });
         btns[0] = return_btn;

        
         Button quit_btn = new Button();
         quit_btn.setText("QUIT");
         quit_btn.setOnAction(new EventHandler<ActionEvent>() {
        	 
             @Override
             public void handle(ActionEvent event) {
                 System.exit(0);
             }
         });
         btns[1] = quit_btn;
         
         
    	return btns;
    }
	
	private HBox createButtonPane(Button[] allBtns) {
		HBox hbox = new HBox();
	    hbox.setPadding(new Insets(10));
	    hbox.setSpacing(8);
	    
	    for (int i = 0; i < allBtns.length;i++) {
	    	allBtns[i].setPrefSize(BTN_WIDTH,  BTN_LENGTH);
        	hbox.getChildren().add(allBtns[i]);
        }
	    return hbox;
	}
	
	 public void start() {        
	        Button[] allBtns = init_btns();
	        HBox bPane = createButtonPane(allBtns);
	        BorderPane root =  new BorderPane();
	        root.setBottom(bPane);
	        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_LENGTH);
	        mainStage = new Stage();
	        mainStage.setTitle("Game");
	        mainStage.setScene(scene);
	        mainStage.show();
	    }
	
	
}

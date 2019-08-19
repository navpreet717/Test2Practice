package reg;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class javaFx  extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
launch(args);
	}


	@Override
	public void start(Stage primaryStage)  {
		// TODO Auto-generated method stub
		Label l1=new Label("enter number 1");
		TextField input = new TextField();
		Label l2=new Label("enter number 2");
		TextField input2 = new TextField();
		
        Button calculate =new Button();
		calculate.setText("Calculate");
		Label result=new Label("");
		calculate.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		    	int calculater= Integer.parseInt(input.getText())+Integer.parseInt(input2.getText());
		    result.setText("result is"+calculater);
		    	
		    }});
		
		 	VBox root=new VBox();
		 	root.setSpacing(10);
		root.getChildren().add(l1);
		root.getChildren().add(input);
		root.getChildren().add(l2);
		root.getChildren().add(input2);
		root.getChildren().add(calculate);
		root.getChildren().add(result);
		primaryStage.setScene(new Scene(root,1200,1920));//setting wIDTH & height
		primaryStage.setTitle("MY FIRST APP");
		primaryStage.show();
	}

}

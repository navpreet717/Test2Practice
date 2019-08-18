package reg;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.control.*;
public class Reg extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
  
    @Override public void start(Stage primaryStage)
    {
        // Create the Character label
        Label quantity = new Label("enter number of T-Shirts");
        quantity.setMinWidth(100);
        
        // Create the Character text field
        TextField input = new TextField();
        Button calculate =new Button();
		calculate.setText("Calculate");
        Label number = new Label();
        Label subtotal = new Label();
        Label tax = new Label();
        Label total = new Label();
        //button
        calculate.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		    	int numberr= Integer.parseInt(input.getText());
		    	double price =0.0;
		    	if(numberr>0 && numberr <6)
		    	{
		    		price=5*numberr;
		    	}
		    	else if(numberr>=6 && numberr <=100)
		    	{
		    		price=2*numberr;
		    	}
		    	else if(numberr>100)
		    	{
		    		price=0.50*numberr;
		    	}
		    	number.setText("the number of tshirts needed::"+numberr);
		    	subtotal.setText("the subtotal is"+price);
		    	double taxresult=price*0.13;
		    	tax.setText("the tax amount is"+taxresult );
		    	double totalresult=price+taxresult;
		    	total.setText("the total amount is"+totalresult );
		    	
		    } });

      //2  Make a layout manager--->root is layout manager
		//StackPane root=new StackPane();
	VBox root=new VBox();
	root.setSpacing(10);
	//HBox root =new HBox();
		//3Add controls to layout manager
	root.getChildren().add(quantity);
	root.getChildren().add(input);
	root.getChildren().add(calculate);
	root.getChildren().add(number);
	root.getChildren().add(subtotal);
	root.getChildren().add(tax);
	root.getChildren().add(total);

	//add layout manager to scene
			//4 add scene to a stage
			primaryStage.setScene(new Scene(root,1200,1920));//setting wIDTH & height
			//5set title
			primaryStage.setTitle("shirt price Calculator");
			//show the app	
			primaryStage.show();
			
			
		}
		}




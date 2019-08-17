import java.util.Observable;
import java.util.Observer;

public class subscrbr implements Observer {

	private String name;
	
	public subscrbr(String n) {
		this.name = n;
	}
	
	public void sayHello() {
		System.out.println("Hello, my name is: " + this.name);
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		// when you receive an update from the publisher,
		// decide what you should do with the message
		
		System.out.println(this.name + " received a message from publisher!");
		System.out.println(" The new grade is: " + arg.toString());
		
		// arg = contains the message that came from the publisher
	}
	
	
	
	
	
}


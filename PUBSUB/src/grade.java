import java.util.Observable;

// Change this to a publisher
public class grade extends Observable {
	private String grade;
	
	public grade(String g) {
		// TODO Auto-generated constructor stub
		this.grade = g;
		
	}

	public void sendMessage() {
		System.out.println("Hello friends my grade is " + this.grade);
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		// 1. Change the grade
		this.grade = grade;

		// 2. Tell everyone about the new grade
		// -------------------------------

		// Indicate that something changed
		this.setChanged();
		// Tell subscribers about the new temperature
		this.notifyObservers(this.grade);
	}

	
	
	
	
}

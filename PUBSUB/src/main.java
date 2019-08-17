import java.util.Scanner;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// 1. Create the PUBLISHER
		grade g = new grade("A");
		g.sendMessage();
		
		// 2. Create the SUBSCRIBER
		subscrbr s = new subscrbr("nav");
		subscrbr s1 = new subscrbr("gursahab");
		subscrbr s2 = new subscrbr("dhillon");
		//e.sayHello();
		
		// 3. Make all listen to the weather station
		g.addObserver(s);
		g.addObserver(s1);
		g.addObserver(s2);
		
		
		// 3. Publisher sends a message (college station changes the grade)
		// Get temperature from user
		System.out.println("What is the new grade? ");
		Scanner ss = new Scanner(System.in);
		String grd = ss.nextLine();
		g.setGrade(grd);
		
		System.out.println(" Sender Updated the grade");
		
	}
}

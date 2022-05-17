package temhw;

import java.util.Scanner;

public class userInput {
	static Scanner in = new Scanner(System.in);
	
	
	public   double temp() {
		System.out.println("Please enter temperature");
		double temp= in.nextDouble();
		return temp;
	}
	
	

}

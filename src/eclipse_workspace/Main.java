package eclipse_workspace;
import java.io.*;
import java.util.*;
/**
 * 
 * @author Chloe Culver and Alex Chheng
 * This class runs all the classes
 */
public class Main {

	public static void main(String[] args) {
		String input;
		if(args.length == 0) {
			System.out.println("Please enter your name, the serivce sold, the price paid, and the date you received this service");
			Scanner in = new Scanner(System.in);
			input = in.nextLine();
		}
		else {
			input = args[0];
		}
		
		System.out.println(input);
		
		
	}

}

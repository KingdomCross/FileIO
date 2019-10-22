/**
 * Alex Chheng and Chloe Culver
 * 10/20/2019
 * Input: It is require for the purchase of the hotel service
 * Output: It print the result to the txt files
 */

import java.io.*;
import java.util.*;

public class HotelTest {
    public static void main(String[] args) throws FileNotFoundException{
    	/**
    	 * Code for Part 1
    	 */
    	
    	/**
    	 * Checks if enough arguments have been passed in
    	 */
    	
		if(args.length == 0) {
			Scanner inpt = new Scanner(System.in);
			System.out.println("Enter number of sales: ");
			int choice = inpt.nextInt();
			String input = "";
			System.out.println("Enter the sales: ");
			for(int i = 0; i < choice ; i++) 
			{
				input += inpt.next() + "\n";
			}	
			try {
				System.out.println("Writing contents onto new File... ");
				/**
				 * Takes contents of arguments and adds them into one string
				 */
				PrintWriter sales = new PrintWriter("sales.txt");

				/**
				 * puts string contents in a scanner class object to be written into the sales.txt file
				 */
				Scanner in = new Scanner(input);
				Scanner e = new Scanner(input);
				/**
				 * writes scanner info onto new file called sales.txt
				 */
				while(in.hasNext()) 
				{
					sales.println(in.nextLine());
				}
				
				
				/**
				 * 	Code for Part II
				 */
				
				/**
				 * Instantiate objects for part 2
				 */
				String str1 = "Conference";
				String str2 = "Dinner";
				String str3 = "Lodging";
				/**
				 * Creates writable files Conference and Data
				 */
				PrintWriter Conference = new PrintWriter("Conference.txt");
				PrintWriter Dinner = new PrintWriter("Dinner.txt");
				PrintWriter Lodging = new PrintWriter("Lodging.txt");
				String LastLine = null;
				while(e.hasNext()) {
					String line = e.nextLine();
					/**
					 * Checks each line if it contains the word Conference,
					 * if it does. then that line and the line before it it written down in the Conference.txt file
					 */
					if(line.contains(str1)) 
					{
					
						Conference.println(line);
					}
					/**
					 * Checks each line if it contains the word Dinner,
					 * if it does. then that line and the line before it it written down in the Dinner.txt file
					 */
					if(line.contains(str2)) 
					{
					
						Dinner.println(line);
					}
					/**
					 * Checks each line if it contains the word Lodging,
					 * if it does. then that line and the line before it it written down in the Lodging.txt file
					 */
					if(line.contains(str3))
					{
					
						Lodging.println(line);
					}
					/**
					 * gets the previous line iterated
					 */
					LastLine = line;
				}
				/**
				 * Closes all the previous files open
				 */
				Lodging.close();
				Conference.close();
				Dinner.close();
				e.close();
				in.close();
				sales.close();
				System.out.println("Files Orgnaized Successfully.");
				}
			/**
			 * Exception handler if no file can be written to
			 */
			catch (FileNotFoundException Exception)
			{
				System.out.println("File not Found");
				
			}

			 
		}
		/**
		 * This part of the code deals with the possibility of passing arguments in the run 
		 * Configuration
		 */
		else {
			String input= "";
		try {

			System.out.println("Writing contents onto new File... ");
			/**
			 * Takes contents of arguments and adds them into one string
			 */
			PrintWriter sales = new PrintWriter("sales.txt");
			for(String s :args) {
				input+= s + "\n";	
			}
			/**
			 * puts string contents in a scanner class object to be written into the sales.txt file
			 */
			Scanner in = new Scanner(input);
			Scanner e = new Scanner(input);
			/**
			 * writes scanner info onto new file called sales.txt
			 */
			while(in.hasNext()) 
			{
				sales.println(in.nextLine());
			}
			
			
			/**
			 * 	Code for Part II
			 */
			
			/**
			 * Instantiate objects for part 2
			 */
			String str1 = "Conference";
			String str2 = "Dinner";
			String str3 = "Lodging";
			/**
			 * Creates writable files Conference and Data
			 */
			PrintWriter Conference = new PrintWriter("Conference.txt");
			PrintWriter Dinner = new PrintWriter("Dinner.txt");
			PrintWriter Lodging = new PrintWriter("Lodging.txt");
			String LastLine = null;
			while(e.hasNext()) {
				String line = e.nextLine();
				/**
				 * Checks each line if it contains the word Conference,
				 * if it does. then that line and the line before it it written down in the Conference.txt file
				 */
				if(line.contains(str1)) 
				{
					
					Conference.println(line);
				}
				/**
				 * Checks each line if it contains the word Dinner,
				 * if it does. then that line and the line before it it written down in the Dinner.txt file
				 */
				if(line.contains(str2)) 
				{
					
					Dinner.println(line);
				}
				/**
				 * Checks each line if it contains the word Lodging,
				 * if it does. then that line and the line before it it written down in the Lodging.txt file
				 */
				if(line.contains(str3))
				{
					//Lodging.println(LastLine);
					Lodging.println(line);
				}
				/**
				 * gets the previous line iterated
				 */
				LastLine = line;
			}
			/**
			 * Closes all the previous files open
			 */
			Lodging.close();
			Conference.close();
			Dinner.close();
			e.close();
			in.close();
			sales.close();
			System.out.println("Files Orgnaized Successfully.");
			}
		/**
		 * Exception handler if no file can be written to
		 */
		catch (FileNotFoundException Exception)
		{
			System.out.println("File not Found");
			
		}

		 
	}

}
    }

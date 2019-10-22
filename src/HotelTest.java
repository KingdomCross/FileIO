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
    	
		if(args.length == 0) {
			System.out.println("Invalid input");
		}
		else {
			String input= "";
		try {

			System.out.println("Writing contents onto new File... ");
			
			PrintWriter out = new PrintWriter("sales.txt");
			for(String s :args) {
				input+= s + "\n";	
			}
			Scanner in = new Scanner(input);
			Scanner e = new Scanner(input);
			while(in.hasNext()) 
			{
				out.println(in.nextLine());
			}
			
			
			/**
			 * 	Code for Part II
			 */
			
			String str1 = "Conference";
			String str2 = "Dinner";
			PrintWriter Conference = new PrintWriter("Conference.txt");
			PrintWriter Dinner = new PrintWriter("Dinner.txt");

			String LastLine = null;
			while(e.hasNext()) {
				String line = e.nextLine();
				if(line.contains(str1)) 
				{
					Conference.println(LastLine);
					Conference.println(line);

				}
				if(line.contains(str2)) 
				{
					Dinner.println(LastLine);
					Dinner.println(line);
				}
				LastLine = line;
			}
			Conference.close();
			Dinner.close();
			e.close();
			in.close();
			out.close();
			System.out.println("File Created Successfully.");
			}

		catch (FileNotFoundException Exception)
		{
			System.out.println("File not Found");
			
		}
		
	
		 
	}

}
    }

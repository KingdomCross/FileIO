import java.io.*;
import java.util.*;

public class HotelTest {
    public static void main(String[] args) throws FileNotFoundException{
     
		if(args.length == 0) {
			System.out.println("Invalid input");
		}
		else {
		try {
			String input= "";
			File data = new File("sales.txt");
			System.out.println("Writing contents onto new File ");
			
			PrintWriter out = new PrintWriter("C:\\Users\\Chloe Culver\\eclipse-workspace\\Stream IO\\sales.txt");
			for(String s :args) {
				input+= s +"\n ";
				
			}
			Scanner in = new Scanner(input);
			while(in.hasNext()) 
			{
				out.println(in.nextLine());
			}
			
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

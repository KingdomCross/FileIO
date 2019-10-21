/**
 * Alex Chheng and Chloe Culver
 * 10/20/2019
 * Input: It is require for the purchase of the hotel service
 * Output: It print the result to the txt files
 */

import java.io.*;
import java.util.*;

public class HotelTest {
    public static void main(String[] args){
        Hotel hoteltest = new Hotel("Hotel Sonavabith", "service", 0, "simpleDateFormat");
        System.out.println(hoteltest.name);
        System.out.println(hoteltest.service);
        System.out.println(hoteltest.sale);
        System.out.println(hoteltest.date);
        System.out.println(hoteltest);

        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        File file = new File("");

        if(args.length < 2){
            System.out.println("Arguments not exist");
            System.exit(0);
        }

        String saleString = args[0];
        String dinnerString = args[1];
        String conferenceString = args[2];

        File saleFile = new File(saleString);
        File dinnerFile = new File(dinnerString);
        File conferenceFile = new File(conferenceString);

        /*if(!saleFile.exists()){
            System.out.println("File not Exist");
        }*/

        //Convert to usable code goal
        /*if(args.length < 2){
            System.out.println("Arguments not exist");
            System.exit(0);
        }

        String inFile = args[0];
        String outFile = args[1];

        File file = new File(inFile); //"table.txt"
        if (!file.exists()) {
            System.out.println("File not exist");
        }
        else{
            PrintWriter out = null;
            try {
                out = new PrintWriter(outFile); //"output.txt"
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            Scanner in = null;
            try {
                in = new Scanner(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            while (in.hasNext()) {
                out.println(in.nextLine());
            }
            in.close();
            out.close();
        }*/
    }
}

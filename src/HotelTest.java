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
    }
}

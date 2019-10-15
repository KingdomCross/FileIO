import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Hotel {
    String name;
    String service;
    double sale;
    String date;

    public Hotel(){

    }

    public Hotel(String name, String service, double sale, String date) {
        this.name = name;
        this.service = service;
        this.sale = sale;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", service='" + service + '\'' +
                ", sale=" + sale +
                ", date='" + date + '\'' +
                '}';
    }
}

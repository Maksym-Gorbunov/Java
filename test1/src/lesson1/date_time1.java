package lesson1;
import java.util.Date;
import java.text.*;

public class date_time1 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.toString());
        System.out.println(d.getTime());    // ml seconds from 1 jan 1970
        System.out.println(d.getMonth());   // counts from 0, real month +1
        System.out.println(d.getYear() + 1900);   // real +1900
        System.out.println(d.getDay());   // counts from 0, real +1
        System.out.println("**********************");

        SimpleDateFormat simple_date = new SimpleDateFormat("E yyyy/MM/dd    HH:mm:ss");
        System.out.println(simple_date.format(d));
    }
}

package PZN.Classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 20022);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        Date result = calendar.getTime();
        System.out.println(result);
    }
}

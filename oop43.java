import java.util.Calendar;

public class oop43 {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();     
        System.out.println(c.getActualMaximum(0));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
    }
    
}

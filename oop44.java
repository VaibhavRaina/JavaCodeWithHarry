import java.util.Calendar;

public class oop44 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

    
    }
    
}

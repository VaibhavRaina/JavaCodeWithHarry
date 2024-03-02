import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class oop45 {
    public static void main(String[] args) {
        LocalDateTime dt= LocalDateTime.now();
        System.out.println(dt);


        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter df2= DateTimeFormatter.ISO_LOCAL_DATE;
        String dd2=dt.format(df2);
        String dd=dt.format(df);
        System.out.println(dd);
        System.out.println(dd2);
    }    

}

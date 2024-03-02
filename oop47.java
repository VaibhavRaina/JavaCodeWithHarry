import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class oop47 {
    public static void main(String[] args) {
        LocalDateTime dt1= LocalDateTime.now();
        DateTimeFormatter df1=DateTimeFormatter.ofPattern("HH-mm-ss");
        String dd=dt1.format(df1);
        System.out.println(dd);
    }
    
}

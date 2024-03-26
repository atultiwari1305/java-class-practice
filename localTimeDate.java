import java.time.*;
import java.time.temporal.ChronoUnit;

public class localTimeDate {
    public static void main(String[] args){
        LocalDate date1 = LocalDate.of(1997,05,16);
        LocalDate date2 = LocalDate.of(2004,05,16);
        System.out.println(ChronoUnit.DAYS.between(date1, date2));
    }
}

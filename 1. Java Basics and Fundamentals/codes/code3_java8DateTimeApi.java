import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class code3_java8DateTimeApi {
    public static void main(String[] args)
    {
        //getting current date time
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        //formatting date time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        String formattedDate = formatter.format(ldt);
        System.out.println(formattedDate);

        //adding months
        System.out.println(ldt.plusMonths(6));

        //zoned date time
        ZonedDateTime zoned_date_time = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(zoned_date_time);
    }
}

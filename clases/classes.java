package clases;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class classes {
    public static void date(){
        LocalDate date = LocalDate.now();
        System.out.println(date);
    }
    public static void time(){
        LocalTime time = LocalTime.now().withSecond(0).withNano(0);
        System.out.println(time);
    }
}

package dodatkowe_zadania.galaxy.rest;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {

    public static void main(String[] args) {

        LocalDateTime acutalTime = LocalDateTime.now();
        System.out.println(acutalTime);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String afterFormat = acutalTime.format(formatter);
        System.out.println(afterFormat);


        LocalDateTime futureDate = LocalDateTime
                .parse("12-12-2030 12:12:12", formatter);

        System.out.println(futureDate);

        if (futureDate.isBefore(acutalTime)) {
            System.out.println("In the future");
        }

        //Konstruktor prywatny
        //ZonedDateTime zonedDateTime = new ZonedDateTime(acutalTime, 0, ZoneId.of("ART"));

        ZonedDateTime zonedDateTime = ZonedDateTime.of(acutalTime, ZoneId.of("Asia/Chita"));

        System.out.println(zonedDateTime);
    }
}

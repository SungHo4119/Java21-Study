package middle1.study23.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeMain {

    public static void main(String[] args) {
        // system default zone
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        LocalDateTime ldt = LocalDateTime.of(2024,01,01,13,10,30);
        ZonedDateTime zdt2 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println(zdt2);

        ZonedDateTime utc = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println(utc);
    }

}

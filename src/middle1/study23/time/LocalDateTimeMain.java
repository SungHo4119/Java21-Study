package middle1.study23.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDateTime ofDt = LocalDateTime.of(2024,01,01,12,10,30);

        System.out.println("현재 날짜시간 : " + localDateTime);
        System.out.println("지정 날짜시간 : " + ofDt);

        LocalDate ofLd = ofDt.toLocalDate();
        LocalTime ofLt = ofDt.toLocalTime();

        System.out.println("ofLd = " + ofLd);
        System.out.println("ofLt = " + ofLt);

        LocalDateTime localDateTime1 = LocalDateTime.of(ofLd, ofLt);
        System.out.println("localDateTime1 = " + localDateTime1);

        // 비교
        System.out.println("오늘이 지정보다 이전인가? : " + localDateTime.isBefore(ofDt));
        System.out.println("오늘이 지정보다 이후인가? : " + localDateTime.isAfter(ofDt));
        System.out.println("오늘이 지정과 같나? : " + localDateTime.isEqual(ofDt));
    }

}

package middle1.study23.time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        LocalTime nowDate = LocalTime.now();

        LocalTime ofLocalTime = LocalTime.of(11,01,01);

        System.out.println("오늘 시간 : "+ nowDate);

        System.out.println("지정 시간 : "+ ofLocalTime);

        ofLocalTime = ofLocalTime.plusSeconds(30);
        System.out.println("지정 시간 : "+ ofLocalTime);
    }

}

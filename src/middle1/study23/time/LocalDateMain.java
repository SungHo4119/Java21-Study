package middle1.study23.time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();

        LocalDate ofDate = LocalDate.of(2024,01,01);

        System.out.println("오늘 날짜 : "+ nowDate);

        System.out.println("지정 날짜 : "+ ofDate);

        ofDate = ofDate.plusDays(10);
        System.out.println("지정 날짜 : "+ ofDate);
    }

}

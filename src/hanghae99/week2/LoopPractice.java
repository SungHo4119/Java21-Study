package hanghae99.week2;

/**
 * 반복문 종류
 * for / while / do-while
 * for(초기화; 조건식; 증감식) {
 *      실행문;
 * }
 *
 * // 향상된 for문
 * for (string str : String[]) {
 *  실행문;
 * }
 *
 * while(조건식) {
 *     실행문;
 * }
 *
 * do {
 *  실행문;
 * } while(조건식);
 */
public class LoopPractice {
    public static void main(String[] args) {

        String[] week = {"월", "화", "수", "목", "금", "토", "일"};
        System.out.println("향상된 for문");
        for (String day : week) {
            System.out.println(day + "요일");
        }
        System.out.println("일반 for문");
        for (int i = 0; i < week.length; i++) {
            System.out.println(week[i] + "요일");
        }

        int count = 0;
        System.out.println("while문");
        while(week.length > count) {
            if(count == 2) {
                System.out.println("3번째 요일에 넘깁니다");
                count++;
                continue;
            }
            else if(count == 3) {
                System.out.println("4번째 요일에 종료합니다.");
                break;
            }
            System.out.println(week[count++] + "요일");

        }

        count = 0;
        System.out.println("do-while문");
        do{
            System.out.println(week[count] + "요일");
            count++;
        } while(week.length > count);

        // 구구단
        for (int i = 2; i <= 9 ; i++){
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }

}

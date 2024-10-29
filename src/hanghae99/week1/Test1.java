package hanghae99.week1;

import java.util.Scanner;

/**
 * 요리 레시피 메모장 만들기
 *
 * 입력값
 * 1. 내가 좋아하는 요리 제목을 먼저 입력합니다.
 * 2. 요리 별점을 1~5점 중 소수점이 있는 실수로 입력해주세요.
 * 3. 이어서 내가 좋아하는 요리 레시피를 한 문장씩 10문장 입력 합니다.
 *
 * 출력값
 * 1. 입력이 종료되면 제목을 괄호로 감싸서 먼저 출력합니다.
 * 2. 이어서, 요리 별점을 소수점을 제외한 정수로만 출력해줍니다.
 * 3. 바로 뒤에 정수 별점으 5점 만점 퍼센트로 표현했을떄 값을 실수로 출력해 줍니다.
 * 4. 이어서 입력한 모든 문장앞에 번호를 붙여서 모두 출력해 줍니다.
 */

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("내가 좋아하는 요리 제목을 입력하세요.");
        System.out.print("요리 제목 : ");
        String title = sc.nextLine();

        System.out.println("요리 별점을 1~5점 중 소수점이 있는 실수로 입력해주세요.");
        double star = sc.nextDouble();
        sc.nextLine();
        String[] text = new String[10];
        System.out.println("이어서 내가 좋아하는 요리 레시피를 한 문장씩 10문장 입력 합니다.");
        while(count < 10 ){
            System.out.print((count + 1 )+"번째 레시피를 입력하세요 : ");
            text[count] = sc.nextLine();

            count++;
        }

        System.out.println("[" + title + "]");
        System.out.println("별점 : "+(int)star + " (" + (star / 5) * 100 + "%)");

        for (int i = 0; i < text.length; i++) {
            System.out.println((i+1) + ". " + text[i]);
        }

    }
}

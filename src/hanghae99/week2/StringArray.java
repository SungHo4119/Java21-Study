package hanghae99.week2;

public class StringArray {
    public static void main(String[] args) {
        String str = "ABCD";

        int strLength = str.length();
        System.out.println("문자열 길이 : " + strLength);

        char strChar = str.charAt(0);
        System.out.println("0번째 문자 : " + strChar);

        String strSub = str.substring(1, 3);
        System.out.println("1~2번째 문자 : " + strSub);

        String newStr = "ABCD";
        boolean strEquals = str.equals(newStr);
        System.out.println("문자열 비교 : " + strEquals);

        char[] strCharAyyay = str.toCharArray();
        System.out.println("문자열 배열로 변환 : " + strCharAyyay);
        System.out.println("문자열 배열로 변환을 다시 문자열로 : " + new String(strCharAyyay));

        // 자바가 메모리 관리를 위해 Stringpool에 저장하여 같은 문자열을 가리키게 한다.
        if("ABC" == "ABC") {
            System.out.println("같은 문자열");
        } else {
            System.out.println("다른 문자열");
        }

        String newString = new String("ABCD");
        // == 연산자는 주소값을 비교하기 때문에 false가 나온다.
        if (str == newString) {
            System.out.println("같은 문자열");
        } else {
            System.out.println("다른 문자열");
        }

    }
}

package middle1.study21.ex1;

/**
 * `String str` 을 `Integer`로 변환해서 출력해라.
 * `Integer` 를 `int`로 변환해서 출력해라.
 * `int` 를 `Integer`로 변환해서 출력해라.
 * 오토 박싱, 오토 언박싱을 사용해서 변환해야 한다.
 */
public class WrapperTest4 {

    public static void main(String[] args) {
        String str = "100";

        Integer integer = Integer.parseInt(str);

        System.out.println("integer = " + integer);

        int num = integer;
        System.out.println("int = " + num);

        Integer integer1 = num;

        System.out.println("integer1 = " + integer1);
    }
}

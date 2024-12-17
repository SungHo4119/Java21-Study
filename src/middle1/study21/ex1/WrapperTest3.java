package middle1.study21.ex1;

/**
 * `String str` 을 `Integer`로 변환해서 출력해라.
 * `Integer` 를 `int`로 변환해서 출력해라.
 * `int` 를 `Integer`로 변환해서 출력해라.
 * 오토 박싱, 오토 언박싱을 사용하지 말고 직접 변환해야 한다.
 */
public class WrapperTest3 {

    public static void main(String[] args) {
        String str = "100";

        Integer integer = Integer.valueOf(str);

        System.out.println("integer = " + integer);

        int num = integer.intValue();
        System.out.println("int = " + num);

        Integer integer1 = Integer.valueOf(num);

        System.out.println("integer1 = " + integer1);
    }
}

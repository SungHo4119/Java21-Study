package middle1.study20.ex;

public class TestString6 {
  // str` 에서 `key` 로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라.
  // indexOf()` 를 반복문과 함께 풀면 된다.
  public static void main(String[] args) {
    String str = "start hello java, hello spring, hello jpa";
    String key = "hello";

    int index = str.indexOf(key);
    int cnt = 0;
    while (index >= 0) {
      index = str.indexOf(key, index+1);
      cnt++;
    }

    System.out.println(cnt);
  }
}

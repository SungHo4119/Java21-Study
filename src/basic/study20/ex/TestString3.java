package basic.study20.ex;

public class TestString3 {
  // `str` 에서 `".txt"` 문자열이 언제부터 시작하는지 위치를 찾아서 출력해라. `indexOf()` 를 사용해라.
  public static void main(String[] args) {
    String str = "hello.txt";

    System.out.println(str.indexOf(".txt"));
  }
}

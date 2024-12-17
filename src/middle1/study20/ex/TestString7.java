package middle1.study20.ex;

public class TestString7 {
  // 문자의 양쪽 공백을 제거해라. 예) `" Hello Java "` `"Hello Java"`
  public static void main(String[] args) {
    String original = " Hello Java ";

    String trimStr = original.trim();

    System.out.println(trimStr);
  }
}

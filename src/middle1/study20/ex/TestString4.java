package middle1.study20.ex;

public class TestString4 {
  // `substring()` 을 사용해서, `hello` 부분과 `.txt` 부분을 분리해라.
  public static void main(String[] args) {
    String str = "hello.txt";

    String hello = subStringFunction(str,"hello");

    String txt = subStringFunction(str,".txt");

    System.out.println(hello);
    System.out.println(txt);
  }

  // 문제 외적으로 함수로 만들어보기
  public static String subStringFunction(String origin, String substring) {
    // 예외일 경우 공백
    if(!origin.contains(substring)) {
      return "";
    }
    return origin.substring(origin.indexOf(substring),origin.indexOf(substring) + substring.length() );
  }
}

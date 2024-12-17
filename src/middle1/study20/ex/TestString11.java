package middle1.study20.ex;

public class TestString11 {
  // `str` 문자열을 반대로 뒤집어라.
  public static void main(String[] args) {
    String str = "Hello Java";
    String reversed = new StringBuilder(str).reverse().toString();

    System.out.println(reversed);

  }
}

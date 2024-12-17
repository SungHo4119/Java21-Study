package middle1.study20.ex;

public class TestString9 {
  // split()` 를 사용해서 이메일의 ID 부분과 도메인 부분을 분리해라.
  public static void main(String[] args) {
    String email = "hello@example.com";

    String[] parts = email.split("@");

    String id = parts[0];
    String domain = parts[1];

    System.out.println("domain = " + domain);

    System.out.println("id = " + id);
  }
}

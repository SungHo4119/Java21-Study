package middle1.study20.ex;

public class TestString10 {
  // `split()` 를 사용해서 `fruits` 를 분리하고, `join()` 을 사용해서 분리한 문자들을 하나로 합쳐라.
  public static void main(String[] args) {
    String fruits = "apple,banana,mango";

    String[] parts = fruits.split(",");
    for (String part : parts) {
      System.out.println(part);
    }

    String joindString = String.join("->", parts);
    System.out.println(joindString);
  }
}

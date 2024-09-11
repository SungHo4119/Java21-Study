package basic.study7.method;

public class methodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world!";
        loop(message,10);
    }
    public static void loop(String message, int i) {
        for (int l = 0; l < i; l++) {
            System.out.println(message);
        }
    }

}
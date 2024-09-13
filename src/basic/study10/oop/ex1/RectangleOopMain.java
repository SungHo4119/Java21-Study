package basic.study10.oop.ex1;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.width = 10;
        r.height = 2;
        System.out.println("넓이 : " + r.calculateArea());
        System.out.println("둘레 길이 : " + r.calculatePerimeter());
        System.out.println("정사각형 여부 : " + r.isSquare());
    }
}

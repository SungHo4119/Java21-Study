package basic.study11.construct.ex1;

public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book("제목", "저자", 500);
        b1.displayInfo();
        Book b2 = new Book("제목", "저자");
        b2.displayInfo();
        Book b3 = new Book();
        b3.displayInfo();

    }
}

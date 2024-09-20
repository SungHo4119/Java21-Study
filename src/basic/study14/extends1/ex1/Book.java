package basic.study14.extends1.ex1;

public class Book extends  Item{
    private String author;
    private String isbn;

    Book (String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    protected void print() {
        super.print();
        System.out.println(" - 저자 : " + author + ", isbn : "+ isbn);
    }
}

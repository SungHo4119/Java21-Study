package basic.study14.extends1.ex1;

public class Item {
    private String name;
    private int price;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    int getPrice(){
        return price;
    }

    void print() {
        System.out.println("이름 : " + name + ", 가격 : " + price);
    }
}

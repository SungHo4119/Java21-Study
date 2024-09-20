package basic.study14.extends1.ex1;

public class Album extends Item {
    private String artist;
    Album (String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    @Override
    protected void print() {
        super.print();
        System.out.println(" - 아티스트 : " + artist);
    }
}

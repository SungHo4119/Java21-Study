package basic.study14.extends1.ex1;

public class Movie extends Item {
    private String director;
    private String actor;
    Movie (String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    protected void print() {
        super.print();
        System.out.println(" - 감독 : " + director + ", 배우 : "+ actor);
    }
}

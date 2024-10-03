package basic.study16.interface1.ex1;

public class Caw extends AbstractAnimal {
    private String sound = "음머";

    @Override
    public void sound() {
        System.out.println(this.sound);
    }
}

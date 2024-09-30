package basic.study16.ex1;

public class Cat extends AbstractAnimal{
    private String sound = "냐옹";

    @Override
    public void sound() {
        System.out.println(this.sound);
    }
}

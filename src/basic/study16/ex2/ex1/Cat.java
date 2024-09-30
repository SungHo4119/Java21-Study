package basic.study16.ex2.ex1;

public class Cat implements InterfaceAnimal {
    private String sound = "냐옹";

    @Override
    public void sound() {
        System.out.println(this.sound + " " +interfaceSound);
    }
}

package basic.study16.ex2.ex1;

public class AnimalMain {
    public static void main(String[] args) {
        soundAnimal(new Cat());
        soundAnimal(new Caw());

    }

    private static void soundAnimal(InterfaceAnimal animal) {
        animal.sound();
    }
}

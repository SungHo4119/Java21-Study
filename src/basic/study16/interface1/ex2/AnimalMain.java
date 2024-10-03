package basic.study16.interface1.ex2;

public class AnimalMain {
    public static void main(String[] args) {
        soundAnimal(new Cat());
        soundAnimal(new Caw());

    }

    private static void soundAnimal(InterfaceAnimal animal) {
        animal.sound();
    }
}

package basic.study15.test1;

public class Grandson extends Child{
    public String value = "Grandson Value";

    @Override
    public void print() {
        System.out.println("Grandson Method - Value : " + this.value);
    }
}

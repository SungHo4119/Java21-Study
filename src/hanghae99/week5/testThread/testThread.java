package hanghae99.week5.testThread;

public class testThread extends Thread {
    @Override
    public void run() {
        for (int i =0; i< 100; i++){
            System.out.print("*");
        }
    }
}

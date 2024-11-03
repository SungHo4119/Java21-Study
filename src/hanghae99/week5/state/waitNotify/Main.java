package hanghae99.week5.state.waitNotify;


public class Main {
    public static String[] itemList = {
            "Mac", "IPhone", "Air", "Pro", "Max"
    };

    public static AppleStore appleStore = new AppleStore();

    public static final int MAX_ITEM = 5;


    public static void main(String[] args) {
        // 가게 점원
        Runnable store = () -> {
            while(true){
                // 0 ~ 4
                int randomItem = (int)(Math.random() * MAX_ITEM);
                // 재고를 넣는 메소드
                appleStore.restock(itemList[randomItem]);

                try{
                    Thread.sleep(50);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        // 고객
        Runnable customer = () -> {
            while(true){
                try{
                    Thread.sleep(77);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }

                int randomItem = (int)(Math.random() * MAX_ITEM);
                // 판매하는 메서드
                appleStore.sale(itemList[randomItem]);
                System.out.println(Thread.currentThread().getName() + " : " + itemList[randomItem]);
            }
        };

        new Thread(store, "store").start();
        new Thread(customer, "customer1").start();
        new Thread(customer,"customer2").start();
    }
}

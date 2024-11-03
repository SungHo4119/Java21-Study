package hanghae99.week5.state.waitNotify;

import java.util.ArrayList;
import java.util.List;

public class AppleStore {
    private List<String> inventory = new ArrayList<>();

    public synchronized void restock(String item){
        while(inventory.size() >= 5){
            try{
                wait();
                Thread.sleep(333);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        inventory.add(item);
        notify();
        System.out.println("inventory 현황 : " + inventory.toString());
    }

    public synchronized void sale(String itemName) {
        while (inventory.size() == 0) {
            try {
                // 재고 없음
                wait();
                Thread.sleep(333);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (true) {
            // 제품 있는지 확인
            for (int i = 0; i < inventory.size(); i++) {
                if (inventory.get(i).equals(itemName)) {
                    inventory.remove(i);
                    notify();
                    return;
                }
            }

            // 고객제품이 없는 경우
            try {
                System.out.println(Thread.currentThread().getName() + ": 제품없어서 기다리는 중");
                wait();
                Thread.sleep(333);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

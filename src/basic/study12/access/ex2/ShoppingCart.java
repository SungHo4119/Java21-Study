package basic.study12.access.ex2;

public class ShoppingCart {
    private Item[] items = new Item[2];
    private int itemCount;

    public void addItem(Item i) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount++] = i;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        for (Item item : items) {
            System.out.println("상품명 : "+ item.getName()+", 합계 : " + item.getTotalPrice());
        }

        System.out.println("전체 가격 합 : " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getTotalPrice();
        }
        return totalPrice;
    }
}

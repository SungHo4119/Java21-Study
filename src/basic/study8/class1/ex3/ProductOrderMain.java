package basic.study8.class1.ex3;

public class ProductOrderMain {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[2];
        // 총 결재 금액
        int totalAmount = 0;
        // 상품 주문 정보를 `ProductOrder` 타입의 변수로 받아 저장
        for (int i = 0; i < productOrders.length; i++) {
            ProductOrder p = new ProductOrder();

            p.productName = "상품" + (i + 1);
            p.price = i * 100;
            p.quantity = (i + 1);

            productOrders[i] = p;
        }
        // 상품 주문 정보와 최종 금액 출력
        for (ProductOrder p : productOrders) {
            System.out.println("productName : " + p.productName + ", price : " + p.price + "원, quantity: " + p.quantity);
            totalAmount += (p.price * p.quantity);
        }
        System.out.println("총 결재 금액 : " + totalAmount);
    }
}

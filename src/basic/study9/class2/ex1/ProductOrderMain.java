package basic.study9.class2.ex1;

public class ProductOrderMain {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[5];
        /*
        for (ProductOrder productOrder : productOrders) {
           항샹된 for문으로 값 변경 불가능 ( for - each )
        }
        */
        // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        for (int i = 0; i <productOrders.length ; i++) {
            productOrders[i] = createOrder("상품명" + i, 100 * i, i);
        }
        // printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(productOrders);
        // getTotalAmount()를 사용해서 총 결제 금액 계산
        int totalAmount = getTotalAmount(productOrders);
        // 총 결제 금액 출력
        System.out.println("총 결재 금액 : " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder p = new ProductOrder();
        p.productName = productName;
        p.price = price;
        p.quantity = quantity;
        return p;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += (order.price * order.quantity);
        }
        return totalAmount;
    }
}

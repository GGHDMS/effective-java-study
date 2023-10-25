package me.effectivejavastudy.chapter01.item01;

import java.util.Arrays;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    // 타입 세이프티
    // 싱글톤
    private OrderStatus orderStatus;

/*
    // 1 - 주문 받음
    // 2 - 준비중
    // 3 - 배송 중
    // 4 - 배송 완료
    private int status;

    private final int PREPARING = 0;
    private final int SHIPPED = 2;
*/

    // 이름을 가질 수 있다.
    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    // 이름을 가질 수 있다.
    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {
        Order order = new Order();

        // Enum 을 key 로 사용하는 Map, Set 은 EnumMap, EnumSet 사용해야 효율적

        // equals 사용하면 NullPointerException 발생한다.
        if (order.orderStatus != OrderStatus.DELIVERED) {
            System.out.println("not delivery");
        }

        Arrays.stream(OrderStatus.values()).forEach(System.out::println);

    }
}

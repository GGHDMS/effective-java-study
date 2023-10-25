package me.effectivejavastudy.chapter01.item01;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

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
}

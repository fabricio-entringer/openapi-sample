package dev.entringer;


import dev.entringer.api.OrderApi;

public class Main {
    public static void main(String[] args) {

        OrderApi orderApi = new OrderApi();
        orderApi.findAllOrders().forEach(orderPub -> System.out.println(orderPub.toString()));
    }
}
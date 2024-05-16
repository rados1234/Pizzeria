package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        System.out.println("Orders!");
        Client client1 = new Client(
                "Zenek","Łąkowa 11E","51766333");
        Order order1 = new Order(client1);
        order1.addItem(new Pizza("Pepperoni", PizzaSize.duża));
        order1.addItem(new Drink("sok1"));
        order1.addItem(new Drink("sok2"));
        orders.add(order1);
        Client client2 = new Client(
                "Krysia","Nadrzeczna 6/3","517888833");
        Order order2 = new Order(client2);
        order2.addItem(new Pizza("Diavola", PizzaSize.średnia));
        order2.addItem(new Pizza("Capriola", PizzaSize.mała));
        order2.addItem(new Drink("Cola"));
        orders.add(order2);
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
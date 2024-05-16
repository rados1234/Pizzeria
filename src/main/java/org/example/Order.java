package org.example;

import java.util.ArrayList;

public class Order {
    Client client;
    ArrayList<Food> foods = new ArrayList<>();

    public Order(Client client) {
        this.client = client;
    }
    public void addItem(Food food){
        foods.add(food);
    }
    public String toString(){
        return client.toString() +"\n " + foods+"\n --------------";
    }
}

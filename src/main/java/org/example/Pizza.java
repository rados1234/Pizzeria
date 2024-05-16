package org.example;

public class Pizza extends Food{

    PizzaSize rozmiar;

    public Pizza(String name, PizzaSize rozmiar) {
        this.name = name;
        this.rozmiar = rozmiar;
    }

    @Override
    public String toString() {
        return super.toString() + " " + rozmiar;
    }
}

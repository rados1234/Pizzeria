package org.example;

public class Client {
    String name;
    String address;
    String telefon;

    public Client(String name, String address, String telefon) {
        this.name = name;
        this.address = address;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}

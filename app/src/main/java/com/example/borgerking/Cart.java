package com.example.borgerking;

public class Cart {
    public String name;
    public int details;
    public int quantity;
    public int total;

    public Cart() {
    }

    public Cart(String name, int details, int quantity, int total) {
        this.name = name;
        this.details = details;
        this.quantity = quantity;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDetails() {
        return details;
    }

    public void setDetails(int details) {
        this.details = details;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order:" + name + "\n" +
                "Price: " + "$" + details + "\n" +
                "Quantity " + quantity + "\n " +
                "Total " + "$" + total + "\n" ;
    }

    public static int total() {
        int total = 0;
        for(Cart c: MainActivity.List) {
            total += c.getTotal();
        }
        return total;
    }

}



package com.company.task6;

public class Item implements Comparable<Item> {
    private int weight;
    private int price;

    public Item(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Item o) {
        double worth1 = 1000 * price / (double) weight;
        double worth2 = 1000 * o.price / (double) o.weight;
        return (int) (worth2 - worth1);
    }

    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", price=" + price +
                ", worth=" + price / (double) weight +
                '}';
    }
}

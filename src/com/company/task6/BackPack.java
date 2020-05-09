package com.company.task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BackPack {
    private int capacity;
    private List<Item> items = new ArrayList<>();

    public void fulfillBackPack(List<Item> items) {
        Collections.sort(items);
        int currentCapacity = capacity;
        for (Item item : items) {
            int itemWeight = item.getWeight();
            if (currentCapacity >= itemWeight) {
                this.items.add(item);
                currentCapacity -= itemWeight;
            }
        }
    }

    public BackPack(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}

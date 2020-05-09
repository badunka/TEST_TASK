package com.company.task6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BackPack backPack = new BackPack(5);
        List<Item> items = createItems();
        System.out.println("список предметов:");
        System.out.println(items);
        backPack.fulfillBackPack(items);
        System.out.println("список предметов запакованных в рюкзак:");
        System.out.println(backPack.getItems());
    }

    private static List<Item> createItems() {
        List<Item> items = new ArrayList<>();
        Item item1 = new Item(1, 0);
        Item item2 = new Item(1, 1);
        Item item3 = new Item(2, 4);
        Item item4 = new Item(2, 5);
        Item item5 = new Item(2, 6);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        return items;
    }

}

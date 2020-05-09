package com.company.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Task3 {
    static void method(String line) throws IOException {


        String[] words = line.split(" ");
        System.out.println("Количество слов: " + words.length);
        System.out.println("неотсортированное:");
        showArray(words);
        Arrays.sort(words);
        System.out.println("Отсортированное:");
        showArray(words);
        String result = capitalizeFirstLetter(words);
        System.out.println("С заглавными");
        System.out.println(result);
    }


    public static String capitalizeFirstLetter(String[] words) {
        StringBuilder text = new StringBuilder();
        for (String word : words) {
            text.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
        }
        return text.toString();
    }

    static void showArray(String[] lines) {
        for (String line : lines) {
            System.out.print(line);
            System.out.print(" ");
        }
        System.out.println();
    }


}

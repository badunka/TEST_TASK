package com.company.task4;

import java.io.IOException;

public class Task4 {
    public static int method(String message, String word) throws IOException {

        if (word.equals("") || message.equals("")) throw new IllegalArgumentException("Invalid input");

        message = message.toLowerCase();
        word = word.toLowerCase();
        String[] wordsinText = message.split(" ");
        int i = message.indexOf(word);
        int count = 0;
        for (String wordinText : wordsinText) {
            if (wordinText.equals(word)) {
                count++;
            }
        }
        return count;


    }


}
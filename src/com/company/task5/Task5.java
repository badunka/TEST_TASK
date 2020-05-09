package com.company.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task5 {
    static void method() throws IOException {

        int minNumber = 0;
        int maxNumber = 100;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("введите  число:");
        String firstNumber = reader.readLine();
        int a = Integer.parseInt(firstNumber);

        if (a >= minNumber || a <= maxNumber) {
            for (int i = minNumber; i < a + 1; i++) {
                if (isPalindrome(i)) {
                    System.out.println(i);
                }
            }
        } else System.out.println("ОШИБКА");

    }

    static boolean isPalindrome(int i) {
        int first = 0;
        int second = i;

        while (second != 0) {
            first = (first * 10) + (second % 10);
            second /= 10;
        }

        return i == first;
    }
}








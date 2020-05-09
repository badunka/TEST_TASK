package com.company.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    static void method() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("введите целое число");

        String numberr = reader.readLine();
        double number = Double.parseDouble(numberr);
        if (number == (int) number) {
            if (number % 2 == 0) {
                System.out.println("число четное");
            } else {
                System.out.println("число нечетное");
            }
        } else {
            {
                System.out.println("число не целое");
            }
        }
    }
}
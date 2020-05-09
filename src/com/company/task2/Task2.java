package com.company.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    static void method() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("введите первое целое число:");
        String firstNumber = reader.readLine();
        double a = Double.parseDouble(firstNumber);

        System.out.println("введите второе целое число:");
        String secondNumber = reader.readLine();
        double b = Double.parseDouble(secondNumber);
        if (a == (int) a && b == (int) b) {
            if (a != 0 || b != 0) {
                int nod = gcd((int) a, (int) b);
                int lcm = lcm((int) a, (int) b);
                System.out.println("НОД=" + nod + " НОК=" + lcm);
            } else {
                System.out.println("Числа некорректные");
            }
        } else {
            System.out.println("Числа не целые");
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}

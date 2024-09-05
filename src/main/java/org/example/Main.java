package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float a = scanner.nextFloat();

        System.out.println("Укажите операцию: ");
        char operation = scanner.next().charAt(0);

        System.out.println("Введите второе число: ");
        float b = scanner.nextFloat();

            if (operation == '+') {
                float result = a + b;
                System.out.println("Результат: " + a + " + " + b + " = " + result);
            } else if (operation == '-') {
                float result = a - b;
                System.out.println("Результат: " + a + " - " + b + " = " + result);
            } else if (operation == '*') {
                float result = a * b;
                System.out.println("Результат: " + a + " * " + b + " = " + result);
            } else if (operation == '/') {
                float result = a / b;
                System.out.println("Результат: " + a + " / " + b + " = " + result);
            } else {
                System.out.println("Операция не поддерживается.");
            }
        }
    }
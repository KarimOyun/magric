package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        System.out.println("Введите первое число: ");
        float a = scanner.nextFloat();

        System.out.println("Укажите операцию сюда: ");
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
                System.out.println("Указанная операция не поддерживается.");
            }
        }
    }
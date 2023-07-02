package ru.geekbrains;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Введите 1 для умножения, для деления 2, для сложения 3, для вычитания 4: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Введите 1 число: ");
        int x = scanner.nextInt();
        System.out.println("Введите 2 число: ");
        int y = scanner.nextInt();
        scanner.close();
        if (num == 1){
            Multiplication(x, y);

        }
        else if (num == 2){
            Division(x, y);

        }
        else if (num == 3){
            Complex(x, y);

        }
        else if (num == 4){
            Subtraction(x, y);

        }
    }
    static void Multiplication(int x, int y){
        int result = x * y;
        System.out.println(x +" * " + y + " = " + result);

    }
    static void Complex(int x, int y){
        int result = x + y;
        System.out.println(x +" + " + y + " = " + result);

    }
    static void Subtraction(int x, int y){
        int result1 = x - y;
        int result2 = y - x;
        System.out.println(x +" - " + y + " = " + result1);
        System.out.println(y +" - " + x + " = " + result2);

    }
    static double Division(double x, double y) {
        double result1 = x / y;
        System.out.println(x +" / " + y + " = " + result1);
        double result2 = y / x;
        System.out.println(y +" / " + x + " = " + result2);

        return result1;
    }
}

package ru.geekbrains;

import java.util.Scanner;

// (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
public class task4 {
    public static void main(String[] args) {
    Resault();
    }
    static void Resault(){
        System.out.println("Введите уравнение,  q + w = e");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите q: ");
        String x = scanner.nextLine();
        System.out.print("Введите w: ");
        String y = scanner.nextLine();
        System.out.print("Введите e: ");
        int z = scanner.nextInt();
        scanner.close();
        System.out.printf("Ваше число:  %s + %s = %d \n", x, y, z);


    }
}

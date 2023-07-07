package Seminar2;

import java.util.Scanner;
// Задача: вывести строку четного размера N > 0, с чередующеми символами c1 и с2
public class Seminar2Task1 {
    public static void main(String[] args) {
        int n = Input();
        char c1 = InputChar1();
        char c2 = InputChar2();
        Str(n, c1, c2);

    }
    static void Str (int n, char c1, char c2){  // функция для проверки условия задачи и вывода ее на экран
        StringBuilder StringText = new StringBuilder(""); // используем StringBuilder для добавления символов
        if (n % 2 == 0){
            for (int i = 1; i <= n; i++){
                if (i % 2 != 0){
                    StringText.append(c1);
                }
                else{
                    StringText.append(c2);
                }
            }
        }
        System.out.println(StringText);
    }
    static int Input(){     // Функция для ввода числа
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        return n;
    }

    static char InputChar1(){           // Функция для ввода char символа
        System.out.print("Введите символ: ");
        Scanner scanner = new Scanner(System.in);
        char c1 = scanner.next().charAt(0);
        return c1;
    }
    static char InputChar2() {              // Функция для ввода char символа
        System.out.print("Введите символ: ");
        Scanner scanner = new Scanner(System.in);
        char c2 = scanner.next().charAt(0);
        scanner.close();       // закрываем сканер, но только в том случае если это последняя задача
        return c2;
    }

}



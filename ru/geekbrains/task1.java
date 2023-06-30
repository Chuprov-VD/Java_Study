package ru.geekbrains;

//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        task1_2();
    }
    static void task1_1(){
        System.out.println("Введите число n");
        Scanner scanner = new Scanner(System.in);
        // для прочитки данных Scanner scanner = new Scanner из консоли (System.in)
        int num = scanner.nextInt(); // для предачи данных в переменную num
        int n = num;
        int n1 = num - 1;
        while (n1 > 0){
            n = n1 + n;
            n1--;
        }
        System.out.println(n);
    }
    static void task1_2(){
        System.out.println("Введите число n");
        Scanner scanner = new Scanner(System.in);
        // для прочитки данных Scanner scanner = new Scanner из консоли (System.in)
        int num = scanner.nextInt(); // для предачи данных в переменную num
        int n = num;
        int n1 = num - 1;
        while (n1 > 0){
            n = n1 * n;
            n1--;
        }
        System.out.println(n);
    }
}

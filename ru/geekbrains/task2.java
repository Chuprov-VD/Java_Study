package ru.geekbrains;
//2) Вывести все простые числа от 1 до 1000
public class task2 {
    public static void main(String[] args) {
        task2_1();
    }
    static void task2_1(){
        int num = 1;
        while (num <= 1000){
            int count = 0;
            for (int i = 1; i <= num; i++){
                if(num % i == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(num);
            }
            else if (num == 1) {
                System.out.println(num);
            }
            num++;
        }
    }
}

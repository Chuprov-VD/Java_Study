package Seminar2;

import java.util.Scanner;

// Напишите метод который сжимает строку Вход: aaaabbbcdd Выход: a4b3c1d2
public class Seminar2Task2 {
    public static void main(String[] args) {
        String wordText = InputString();
        OutputString(wordText);


    }
    static String InputString(){
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        return word;
    }
    static void OutputString(String word){
        StringBuilder StringText = new StringBuilder("");
        int count = 0;
        int j = 0;
        char symbol = word.charAt(0);
        char previChar = word.charAt(0);
        for (int i = 0; i < word.length(); i++ ){
            symbol = word.charAt(i);
            previChar = word.charAt(j);
            if (symbol == previChar) {
                count++;
            }
            else {
                StringText.append(word.charAt(i-1)).append(count);
                j = j + count;
                count = 1;
            }
        }
        StringText.append(word.charAt(word.length() - 1)).append(count);
        System.out.println(StringText);
    }
}

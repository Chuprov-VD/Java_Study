package Seminar2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// Напишите метод который сжимает строку Вход: ffffkkkrkrlflcaavvrraaaff Выход: a5c1f7k4l2r4v2
public class Seminar2Task2 {
    public static void main(String[] args) {
        String wordText = InputString();
       // OutputString(wordText);
        System.out.println(newDecision(wordText));



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
        for (int i = 0; i < word.length(); i++ ){
            char symbol;
            symbol = word.charAt(i);
            char twoChar;
            twoChar = word.charAt(j);
            if (symbol == twoChar) {
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
    static StringBuilder newDecision(String word){
        char [] chars = word.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
        int count = 0;
        int j = 0;
        StringBuilder stringBuilders = new StringBuilder();

        for (int i = 0; i < chars.length; i++ ){
            if(chars[i] == chars[j]){
                count++;
            }
            else{
                    char symbol = chars[j];
                    stringBuilders.append(symbol).append(count);
                    j = j + count;
                    count = 1;
                }
            }
        char symbol = chars[j];
        stringBuilders.append(symbol).append(count);
        return stringBuilders;
    }

}


package Telephone;

import TelephoneBook.TelephoneBook;

import java.util.*;

/*
    Реализуйте структуру телефонной книги с помощью HashMap.
    Программа также должна учитывать, что во входной структуре будут
    повторяющиеся имена с разными телефонами, их необходимо считать,
    как одного человека с разными телефонами.
    Вывод должен быть отсортирован по убыванию числа телефонов.
 */

public class Main {
    public static void main(String[] args) {
        Telephone book = new Telephone();
        book.add("Шаталов Петр", "123");
        book.add("Иванова Ольга", "456");
        book.add("Степанова Яна", "789");
        book.add("Печкуров Сергей", "321");
        book.add("Печкуров Сергей", "213");
        book.add("Печкуров Сергей", "89578");
//        System.out.println(book);
//        book.deleteByName("Печкуров Сергей");
//        System.out.println(book);
//        System.out.println(book.getPhoneByName("Шаталов Петр"));
//        System.out.println(book.getNameByPhone("456"));
//        book.deleteOnlyPhone("123");
        System.out.println(book);
        System.out.println(book.showAll());

    }
}
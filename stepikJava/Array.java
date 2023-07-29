package stepikJava;

public class Array {
        public static void main(String[] args) {
        String [] nameOfMonth = new String[12]; // создаем массив строкого типа с названием
        // "nameOfMonth" c 12 элементами
        nameOfMonth[0] = "Январь";
        nameOfMonth[1] = "Февраль";
        nameOfMonth[2] = "Март";
        for (int i = 0; i < nameOfMonth.length; i++){
            if (i < nameOfMonth.length - 1) {
                System.out.print(nameOfMonth[i]);
                System.out.print(", ");
            }
            else{
                System.out.print(nameOfMonth[i]);
                System.out.print(".");
            }
        }
    }
}

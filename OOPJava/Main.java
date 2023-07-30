package OOPJava;
// применение ООП использование класса Dog для объекта Альф
public class Main {
    public static void main(String[] args) {
        Dog alf = new Dog();
        alf.name = "Альф";
        alf.breed = "Долматинец";
        alf.weight = 12;
        String resume = alf.resumeDog();
        System.out.println(resume);
    }

}

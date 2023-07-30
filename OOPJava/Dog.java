package OOPJava;

public class Dog {
    String name;
    String breed;
    int weight;

    String resumeDog(){
        return "Имя собаки: " + name + "\n" + "Порода собаки: " + breed + "\n" + "Вес собаки: " + weight + "кг.";
    }
}

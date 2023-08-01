package OOPJava;

public class MainMonster {
    public static void main(String[] args) {
        Monster gera = new Monster(4);
        gera.size();
        gera.voise(4, "Arrr");

        Monster gena = new Monster(5,4,4);
        gena.size();
        gena.voise();

        System.out.println(gera.sizeMonster(gena));
        Monster fedr = gera.copy();
        fedr.size();
    }
}

package OOPJava;

public class Monster {
    //  размеры монстра
    int eyes;
    int hands;
    int legs;

    Monster() {
        this(2); // если в объект не прередаеются параметры то мы ссылаемся на объект с 1 параметром
    }
    Monster copy(){
        return new Monster(eyes, hands, legs); // копируем текущий объект в новый
    }
    Monster(int show) {
        this(show, show, show); // когда в объект передается 1 параметр, мы передаем 3 таких же в др. объект
    }
    Monster(int eyes, int hands, int legs) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }
    int getVolume(){   // размер монстра
        return eyes + hands + legs;
    }

    void voise() {
        System.out.println("Grrrrrr...");
    }

    void voise(int num) {
        while (num > 0) {
            System.out.println("Grrrrrr...");
            num--;
        }
    }
    void voise(int num, String strVoise) {
        while (num > 0) {
            System.out.println(strVoise);
            num--;
        }
    }
    void size(){
        System.out.printf("У монстра: %d глаз\n", eyes );
        System.out.printf("У монстра: %d рук\n", hands );
        System.out.printf("У монстра: %d ног\n", legs );
    }
    int sizeMonster(Monster sizeMonsterTwo){
        int currentMonster = getVolume();
        int sizeMonsterTwoVolume = sizeMonsterTwo.getVolume();
        int result = currentMonster - sizeMonsterTwoVolume;
        if (result > 0){
            return 1;
        }
        else if (result < 0){
            return -1;
        }
        else {
            return 0;
        }
    }
}
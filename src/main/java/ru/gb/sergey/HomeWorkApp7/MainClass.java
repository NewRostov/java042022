package ru.gb.sergey.HomeWorkApp7;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[] {
                new Cat("Мурзик", 10),
                new Cat("Барсик", 20),
                new Cat("Рыжик", 30)
        };
        Plate plate = new Plate(40);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.isSatiety() ? cat.getName() + " не голоден" : cat.getName() + " голоден");
            System.out.println("в тарелке " + plate.getFood() + " еды");
            System.out.println();
        }
    }
}

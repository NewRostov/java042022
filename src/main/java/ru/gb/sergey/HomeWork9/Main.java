package ru.gb.sergey.HomeWork9;

//1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
//Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).

//2. Создайте два класса: беговая дорожка и стена, при прохождении через которые,
//участники должны выполнять соответствующие действия (бежать или прыгать),
//результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).

//3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.

//4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
// Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.


public class Main {
    public static void main(String[] args) {
        Participants[] participants = {
                new Robot(49,100),
                new Human(60,140),
                new Cat(150, 300)
        };

        Obtacles[] obtacles = {
                new Track(100),
                new Wall(50),
                new Track(50),
                new Track(70),
                new Wall(120),
                new Track(90)
        };

        for (Obtacles obtacle : obtacles) {
            for (Participants participant : participants) {
                obtacle.overcome(participant);
            }

        }
    }
}
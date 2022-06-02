package ru.gb.sergey;

public class HomeWorkApp5 {
    public static void main(String[] args) {

        personal[] persAray = new personal[5];
        persAray[0] = new personal( "Andrey Sokolov", "director", "director@aaa.com", 00000, 10000, 52);
        persAray[1] = new personal("Sergey Orlov", "ingener", "ingener@aaa.com", 21111, 9000, 55 );
        persAray[2] = new personal("Igor Kulikov", "texnik", "texnik@aaa.com", 22222, 5000, 25);
        persAray[3] = new personal("Inna Petrova", "account", "account@aaa.com", 3333, 7000, 44 );
        persAray[4] = new personal("Dmitriy ivanov", "sisadmin", "sisadmin@aaa.com", 4444, 000, 35);


        for (int i = 0; i < persAray.length; i++) {
            if (persAray[i].getAge() > 40) {
                System.out.println("ФИО " + persAray[i].getFullName() + ", Должность " + persAray[i].getPoast() +", почта  "+ persAray[i].getEmail() + ", Зарплата " + persAray[i].getMoney() + ", Возраст " + persAray[i].getAge());
            }

        }



    }

}

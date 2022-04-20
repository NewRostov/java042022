package ru.gb.sergey;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(c(2, 6)); // задание 1

        d(-1); //задание 2

        System.out.println(e(-5)); // задание 3

        str("word", 1); // задание 4


        year(104); // задавние 5


    }
    public static boolean c (int a, int b) {

        int summ = a + b;
        return summ > 10 && summ < 20;
    }

    public static void d(int a) {
        if (a >= 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }

    }

    public static boolean e(int a) {
            return a >= 0;
    }


    public static void str(String a, int b ) {
        for (int i = 0; i < b; i++)
        {
            System.out.println(a + (i + 1));
        }
    }



    // високосный год -- ХЗ -- как вычислять?????
    // если делится на 4 без остатка значит високосный
    // каждый 100 год не високосный
    // и каждый 400 високосный
    public static void year(int a ) {

        if (a % 400 == 0 ) {
            System.out.println("високосный потому что какждый 400-й год");
        } else if (a % 100 == 0) {
            System.out.println("не високосный потому что делится на 100");
        } else if (a % 4 == 0) {
            System.out.println("  високосный потому что делится на 4");
        } else {
            System.out.println("не високосный НЕ делится на 4");
        }
    }


}

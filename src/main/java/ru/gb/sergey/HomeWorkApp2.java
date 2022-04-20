package ru.gb.sergey;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(c(2, 6)); // задание 1

        d(-1); //задание 2

        System.out.println(e(-5)); // задание 3
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


}

package ru.gb.sergey;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        Numbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    public static void checkSumSign() {
    int a = 11;
    int b = -22;
    int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }


    public static void printColor() {
        int value = -5;
                if (value <= 0) {
                    System.out.println("Красный");
                }
                if (value > 0 && value <= 100) {
                    System.out.println("Желтый");
                }
                if (value > 100) {
                    System.out.println("Зеленый");
                }
    }


    public static void Numbers() {
        int a = -6;
        int b = 5;
        if (a >= b ) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }
}




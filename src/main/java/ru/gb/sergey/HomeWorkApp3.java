package ru.gb.sergey;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        // задание 1
        System.out.println("задание 1");

        int[] a = { 0, 0, 1, 1, 0 };
        for (int i = 0; i < a.length; i++){
            if (a[i] == 0){
                a[i] = 1;
            }else {
                a[i] = 0;
            }
            System.out.println(a[i]);
        }
        // задание 2
        System.out.println("задание 2");

        int[] b = new int[100];
        for (int i = 0; i < b.length; i++){
            b[i] = i + 1;
            System.out.print("arr" + i + "="+ b[i] + ", ");
        }

        // задание 3
        System.out.println();
        System.out.println("задание 3");

        int[] r = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < r.length; i++){
            if (r[i] < 6){
                r[i] = r[i] * 2;
            }
            System.out.print("arr" + i + "=" + r[i] + ", ");
        }
    }

}

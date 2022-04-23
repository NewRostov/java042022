package ru.gb.sergey;

public class HomeWorkApp3 {
    public static void main(String[] args) {

        int[] a = { 0, 0, 1, 1, 0 };
        for (int i=0; i< a.length; i++){
            if (a[i] == 0){
                a[i] = 1;
            }else {
                a[i] = 0;
            }
            System.out.println(a[i]);
        }
    }

}

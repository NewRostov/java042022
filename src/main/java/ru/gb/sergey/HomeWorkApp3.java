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

        // задание 4
        // i=j
        // 0=5  - сумма = длине массива ??? вроде верно !!!
        // 1=4
        // 2=3
        // 3=2
        // 4=1
        // Допустим некая переменая s равно сумме i+j, а это длина квадратного двуменого массива,
        // следовательно i+j=d.length
        // с учетом того что индекс массиво начинается с нуля, то длина массива по факту на единицу больше индекса
        //следовательно вычитаем из d.length единицу
        // или i = (d.length -1 ) - j

        System.out.println();
        System.out.println("задание 4");
        int[] [] d = new int[5][5];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                if((i == j) || (i == (d.length - 1) - j)){
                    d[i][j] = 1;
                }else {
                    d[i][j] = 0;
                }
                System.out.print(d[i][j]);
            }
            System.out.println();
        }

        // задание 6 как найти максимумум и минимум?
        // сравнить все числа поочередно i-й с i+1 и присваивать переменым МАХ максимум, MIN минимум
        // счетчик с циклом

        System.out.println();
        System.out.println("задание 6");

        int[] m = { 0, 2, 3333, 4, 4, 5, 66, 89999 };
        int[] max = new int[1];
        int[] min = new int[1];
        max[0] = m[0];
        min[0] = m[0];
        for (int i = 0; i < m.length; i++) {

            if (max[0] < m[i]){
                max[0] = m[i];
            }
            if ( min[0] > m[i] ){
                min[0] = m[i];
            }
        } System.out.println("max = " + max[0]);
          System.out.println("min = " + min[0]);



    }
    // задание 5
    public static int[] array (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
}


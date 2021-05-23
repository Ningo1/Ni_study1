package rugeekbrains.Ni1;

import java.util.Arrays;

public class HomeWork3p2 {
    public static void main(String[] args) {
        twoDimArr(); //4.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы
                     // единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
                     // то есть [0][0], [1][1], [2][2], …, [n][n];
        lenArr(10,5 ); //5.Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
                                    // каждая ячейка которого равна initialValue
    }

    public static void twoDimArr() {
        int[][] twoarr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    twoarr[i][j] = 1;
                }
                System.out.print(twoarr[i][j] + " ");
            }
                System.out.println();
        }
    }

    public static void lenArr(int len, int initialValue) {
        int[] arrl= new int[len];
        for (int i=0; i<len; i++){
            arrl[i]=initialValue;
        }
        System.out.println(Arrays.toString(arrl));
    }
}



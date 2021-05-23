package rugeekbrains;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args){
        changedToArr(); //1.Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        pystArr(); //2.Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        multipArr(); //3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    }
    public static void changedToArr() {
        int[] arr = {0, 1, 0, 0, 1, 1, 1, 0};
       System.out.println(Arrays.toString(arr));

        for (int i=0; i<8; i++){
             if (arr[i]==0) {
                 arr[i] = 1;
             }else {
                 arr[i] = 0;
             }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void pystArr() {
        int[] arrpy= new int[100];
        for (int i=0; i<100; i++){
            arrpy[i]=i+1;
        }
        System.out.println(Arrays.toString(arrpy));
    }

    public static void multipArr() {
        int[] arrmu = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arrmu));
        for (int i=0; i<12; i++){
            if (arrmu[i]<6) {
                arrmu[i] = arrmu[i]*2;
            }
        }
        System.out.println(Arrays.toString(arrmu));
    }
}




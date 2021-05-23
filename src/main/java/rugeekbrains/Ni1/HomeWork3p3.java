package rugeekbrains.Ni1;

import java.util.Arrays;

public class HomeWork3p3 {
    public static void main(String[] args) {
        minMaxArr(); //6*.Задать одномерный массив и найти в нем минимальный и максимальный элементы
    }
    public static void minMaxArr() {
        int[] arrmami = {1, 50, 3, 21, 11, 0, 5, 3, 4, 1};
        System.out.println(Arrays.toString(arrmami));

        int min = Arrays.stream(arrmami).min().getAsInt();
        int max = Arrays.stream(arrmami).max().getAsInt();
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}


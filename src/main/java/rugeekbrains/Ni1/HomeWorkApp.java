package rugeekbrains.Ni1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkSum();
        }

    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_ Banana");
        System.out.println("_ Apple");
    }

    public static void checkSumSign() {
        int a = 1, b = -2;
        int s;
        s = a + b;
        if (s >= 0) {
            System.out.println("Сумма положительная");
        }
        if (s < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 2, b=4;
        if (a >= b) {
            System.out.println("a >= b");
        }
        if (a < b) {
            System.out.println("a < b");
        }
    }

     public static void checkSum(){
        int k = 10, n=5;
        if (k+n >= 10 && k+n<=20) {
            System.out.println("true");
        }
        else  {
            System.out.println("false");
        }
    }
    }





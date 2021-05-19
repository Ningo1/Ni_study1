package rugeekbrains.Ni1;

public class HomeWork2 {
    public static void main(String[] args) {
        checkNumber(-10);
        System.out.println(checkNumberNew(10));
    }

    public static void checkNumber(int a) {
        if (a >= 0) {
            System.out.println("положительное число");
        } else {
            System.out.println("отрицательное число");
        }
    }

    public static boolean checkNumberNew(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }
}

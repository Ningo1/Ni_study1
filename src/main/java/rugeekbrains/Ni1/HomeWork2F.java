package rugeekbrains.Ni1;

public class HomeWork2F {
    public static void main(String[] args) {
        System.out.println(checkVisE(2001));
    }

    public static boolean checkVisE(int a) {
        if (a % 4 != 0 | (a % 400 != 0 & a % 100 == 0)) {
            return false;}
        else {
            return true;}
    }
}


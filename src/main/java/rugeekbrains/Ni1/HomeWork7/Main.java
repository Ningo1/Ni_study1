package rugeekbrains.Ni1.HomeWork7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Том", 5), new Cat("Тимка", 4),new Cat("Мурзик",3)};
        Plate plate = new Plate(10);
        plate.info();
        int dlm=3;
        for (int sh = 0; sh <= dlm; sh++) {
            for (int i = 0; i < dlm; i++) {
                if (plate.getFood() >= cats[i].appetite) {
                    cats[i].eat(plate);
            }
        }
        }
    }
}



        // 1-й вариант на 2 кота без использования массива
    //        Cat cat1 = new Cat("Barsik", 5);
    //        Cat cat2 = new Cat("Myrzik", 4);
     //       cat1.info();
     //       for (int sh = 0; sh <= 2; sh++) {
    //            if (plate.getFood() >= cat1.appetite) {
    //                cat1.eat(plate);
     //           }
     //           cat2.info();
     //           if (plate.getFood() >= cat2.appetite) {
     //               cat2.eat(plate);
     //           }
     //       }


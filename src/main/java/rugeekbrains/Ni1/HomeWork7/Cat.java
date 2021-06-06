package rugeekbrains.Ni1.HomeWork7;

public class Cat {
    public String name;
    public int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        System.out.println("plate:  " + p.getFood() + "  name " + name);
    //    for (int sh=0; p.getFood() >= appetite; sh++) {
                p.descreaseFood(appetite);
                System.out.println("true");
                System.out.println("Поел:   " + name + ",  Остаток в plate:  " + p.getFood());
    //    }
        if (p.getFood() < appetite) {
          System.out.println("Мяу! Закончилась еда!");
         p.plusFood(appetite);
          System.out.println("Тарелка пополнилась, в ней  " + p.getFood());
     }
    }
    public void info(){
        System.out.println("кот " + name + " ,апетит= " + appetite);
   //     System.out.printf("name = %s,\n" + "appetite = %d, \n", name, appetite);
    }
}


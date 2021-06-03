package rugeekbrains.Ni1.HomeWork6;

public class Main {

    public static void main(String[] args){
        Cat cat1 = new Cat("Tom", "Black", 100);
        System.out.println(cat1.getName());
        System.out.println(cat1.getColor());
        cat1.animalsInfo();
        cat1.run();

       // if (int dl<=200) {
         System.out.println(cat1.name + "  пробежал  " + 100 + "   метров");
       // }

        Cat cat2 = new Cat("Timka", "Grey", 50);
        cat2.run();
        System.out.println(cat2.name + "  пробежал  " + 50 + "   метров");

        Dog dog1 = new Dog("Bobik", "Grey");
        System.out.println(dog1.getName());
        System.out.println(dog1.getColor());
        dog1.animalsInfo();
        dog1.run();
        System.out.println(dog1.name + "  пробежал  " + 200 + "   метров");
        dog1.swiming();
        System.out.println(dog1.name + "  проплыл  " + 10 + "   метров");

       // public void cat1run(int dl){
          //  if (cat1.dl<=200){
         //       cat1.run();
       //      System.out.println('name' + "пробежал" + dl+ "метров");
       //    }
    }

       // Animals animals = new Cat("Tim", "W");
       // animals.run(int d);
      // if (animals instanceof Cat) {
       //     System.out.println(animals.name + "  пробежал");
    //   }

   //     Dog dog = new Dog("Bobik", "Grey");
   //       System.out.println(dog.getName());
  //      System.out.println(dog.getColor());
  //      dog.animalsInfo();
  //      dog.run();
   //     dog.swiming();

    //}
    //public static void dog.ran (int d){
        //if (d<=500){
            //System.out.println(name + "пробежал" + d + "метров");

}



package rugeekbrains.Ni1.HomeWork5;

public class HomeW5 {

    public static void main(String[] args){
        Employee e3 = new Employee("Aleks","Any","AA@gmail.com","89031552525",1000,37);
        e3.info();
        e3.setAge(30);
        e3.info();
        Employee[] empArray = new Employee[4];
        empArray[0] = new Employee("Иванов Иван","Инженер","II@gmail.com","89031242424",2500,28);
        empArray[1] = new Employee("YY","Any","YA@gmail.com","89162352525",2500,29);
        empArray[2] = new Employee("Петров Петр","Any","PA@gmail.com","89032015656",2500,31);
        empArray[3] = new Employee("Alex","Any","AlA@gmail.com","89152031212",3000,45);

     // for (int i=0; i<5; i++){
        //  if (age<40){
       //      empArray[].info();
      //  System.out.println(empArray[i]);
      //    }
    //  }
   }
}
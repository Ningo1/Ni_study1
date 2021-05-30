package rugeekbrains.Ni1.HomeWork5;

import java.util.Arrays;

public class Employee {
    private String Name; //ФИО
    private String Position; //Должность
    private String Email;
    private String Telephone;
    private int TneSalary;
    private int Age;

    public String getName() {
        return Name;
    }

    public String getPosition() {
        return Position;
    }

    public String getEmail() {
        return Email;
    }

    public String getTelephone() {
        return Telephone;
    }

    public int getTneSalary() {
        return TneSalary;
    }

    public int getAge() {
        return Age;
    }

    public Employee(String name, String position, String email, String telephone, int tneSalary, int age) {
        this.Name = name;
        this.Position = position;
        this.Email = email;
        this.Telephone = telephone;
        this.TneSalary = tneSalary;
        this.Age = age;
    }


    public static void main(String[] args) {
        Employee e1 = new Employee("Иванов Иван", "Инженер", "II@gmail.com", "+7(903)1554433", 3000, 35);
        e1.info();

// Массив из 5 сотрудников
        Employee[] empArray = new Employee[4];
        empArray[0] = new Employee("Иванов Иван","Инженер","II@gmail.com","89031242424",2500,28);
        empArray[1] = new Employee("YY","Any","YA@gmail.com","89162352525",2500,29);
        empArray[2] = new Employee("Петров Петр","Any","PA@gmail.com","89032015656",2500,31);
        empArray[3] = new Employee("Alex","Any","AlA@gmail.com","89152031212",3000,45);
       // empArray[].info();
    }

      //      public void inArr(){
     //     for (int i=0; i<5; i++){
    //      if (age>40){
    //           System.out.println(empArray[i]);
    //       }
  //     }
 //      }


    public void info(){

        System.out.println("Сотрудник: " + Name + "; Должность: " + Position + "; Email: " + Email + "; Телефон: " + Telephone + "; Зарплата: " + TneSalary + "; Возраст: " + Age);

    }


    public void setName(String name) {
        Name = name;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public void setTneSalary(int tneSalary) {
        TneSalary = tneSalary;
    }

    public void setAge(int age) {
        Age = age;
    }
}


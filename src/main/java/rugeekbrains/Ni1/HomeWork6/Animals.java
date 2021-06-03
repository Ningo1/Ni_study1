package rugeekbrains.Ni1.HomeWork6;

public class Animals {
    protected String name;
    protected String color;
  //  protected int dl;


    public Animals(String name, String color) {
        this.name = name;
        this.color = color;
       // this.dl = dl;
    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

 //   public int getDl() {
  //      return dl;
//    }

 //   public void setDl(int dl) {
  //      this.dl = dl;
 //   }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void animalsInfo(){
        System.out.println("Животное: " + name);
    }
    public void run(){
       // if (dl<=500){
            System.out.println(name+  "   пробежал ");
     //   }
    }
    public void swiming(){
        System.out.println("Животное проплыло:  " + name);
    }

}

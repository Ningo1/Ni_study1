package rugeekbrains.Ni1.HomeWork7;

public class Plate {
    public void setFood(int food) {
        this.food = food;
    }

    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void descreaseFood(int n){
        food -= n;
    }
    public void info(){
        System.out.println("plate: " + food);
    }
    public void plusFood(int m){
        m=20;
        food += m;
    }
}

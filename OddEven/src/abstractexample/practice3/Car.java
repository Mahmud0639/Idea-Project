package abstractexample.practice3;

public class Car extends Vehicle{
    int gear;
    public Car(String color, double weight,int gear){
        super(color,weight);
        this.gear = gear;


    }
    @Override
    void display(){
        super.display();
        System.out.println("Gear: "+gear);

    }
}

package book_super_inheritance.problem6_which_will_print;

public class SportCar extends Car{
    int speed = 100;

    public void printSpeed(){
        System.out.println("Speed: "+speed);
        System.out.println("Speed : "+super.speed);
    }
}

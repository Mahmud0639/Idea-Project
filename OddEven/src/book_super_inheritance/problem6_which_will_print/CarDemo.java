package book_super_inheritance.problem6_which_will_print;

public class CarDemo {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar();
        sportCar.printSpeed();//here output will be 100 even it also has speed = 50 when it extends the Car class
        //to print out super class speed we should follow in the SportCar class code:

    }
}

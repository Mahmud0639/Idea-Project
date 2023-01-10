package oop.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.legCount = 4;
        dog.sleepTime = 3.40;
        dog.foodName = "Meat";

        dog.printData();
        dog.printAnotherData();
    }
}

class Animal{
    int legCount;
    double sleepTime;
    String foodName;

    void printData(){
        System.out.println("Leg count info is : "+legCount+" in numbers");
        System.out.println("Sleep time info is "+sleepTime+" hours");
        System.out.println("Food they eat info is "+foodName);
    }
}
class Dog extends Animal{
    void printAnotherData(){
        int teethCount = 42;
        System.out.println("Teeth info is "+teethCount+" in numbers");
    }
}

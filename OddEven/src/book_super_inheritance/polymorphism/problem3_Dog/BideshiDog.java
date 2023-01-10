package book_super_inheritance.polymorphism.problem3_Dog;

public class BideshiDog extends Dog{

    public String getType(){
        System.out.println("Bideshi Dog");
        return "Bideshi Dog";
    }
    public String getName(){
        return "Poodle";
    }
}

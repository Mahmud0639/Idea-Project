package book_super_inheritance.polymorphism.problem3_Dog;

public class DeshiDog extends Dog{

    @Override
    public String getType(){
        System.out.println("Deshi Dog");
        return "Deshi Dog";
    }
}

package book_super_inheritance.polymorphism.problem1_Liquid;

public class Coffee extends Liquid{

    @Override
    public void Swirl(boolean clockwise){
        System.out.println("Swirling Coffee");
    }
}

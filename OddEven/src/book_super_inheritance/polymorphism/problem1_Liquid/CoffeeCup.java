package book_super_inheritance.polymorphism.problem1_Liquid;

public class CoffeeCup {
    private Liquid innerLiquid;

    void  addLiquid(Liquid liq){
        innerLiquid.Swirl(false);
    }
}

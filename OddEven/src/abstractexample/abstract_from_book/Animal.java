package abstractexample.abstract_from_book;

import java.security.PublicKey;

public class Animal {
    private int legs;
    public Animal(int legs){
        this.legs = legs;
    }
    public void sleep(){
        String name = getClass().getSimpleName();
        System.out.println(name+" Sleeping...Don't disturb!");
    }
}
 class Lion extends Animal{

   public Lion(int legs){
       super(legs);
   }

}
class Tiger extends Animal{
    public Tiger(int legs){
        super(legs);
    }
}
class MiniZoo{
    private Animal[] animals;
    public MiniZoo(Animal[] animals){
        this.animals = animals;
    }
    public void putThemeOnSleep(){
        for (Animal animal: animals){
            animal.sleep();
        }
    }
}
class MiniZooDemo{
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger(4);
        animals[1] = new Lion(4);
        MiniZoo miniZoo = new MiniZoo(animals);
        miniZoo.putThemeOnSleep();
    }
}

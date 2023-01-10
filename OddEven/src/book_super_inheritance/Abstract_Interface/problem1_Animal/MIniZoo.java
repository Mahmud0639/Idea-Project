package book_super_inheritance.Abstract_Interface.problem1_Animal;

public class MIniZoo {
    private Animal[] animals;

    public MIniZoo(Animal[] animals){
        this.animals = animals;
    }

    public void putThemeOnSleep(){

        for (Animal animal: animals){
            animal.sleep();
        }
    }
}

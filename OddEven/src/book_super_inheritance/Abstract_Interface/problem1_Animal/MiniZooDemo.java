package book_super_inheritance.Abstract_Interface.problem1_Animal;

public class MiniZooDemo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];//jevabe amra String[] type er array create kori...same ekhane Animal class er type
        //a amra array create koresi..jehetu amader Animal super class er sub class gulo array akare pathate hobe.

        animals[0] = new Tiger(4);
        animals[1] = new Lion(4);

        MIniZoo mIniZoo = new MIniZoo(animals);
        mIniZoo.putThemeOnSleep();

    }
}

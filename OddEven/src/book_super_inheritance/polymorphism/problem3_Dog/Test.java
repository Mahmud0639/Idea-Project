package book_super_inheritance.polymorphism.problem3_Dog;

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        //below 2 reference type is called Up Casting
        Dog dog2 = new DeshiDog();
        Dog dog3 = new BideshiDog();

        System.out.println("Type :"+dog1.getType());
        System.out.println("Type :"+dog2.getType());
        System.out.println("Type :"+dog3.getType());

        //ekhane beparta holo je sob bepar gulo super class er sathe mil thakbe oi guloi sudho matro reference variable diye
        //call korle output dekhabe.Tar mane jodi super calss ekti matro method thake tahole er polymorphism class gulo te o
        // ekti matro method thakbe and taake reference variable diye call kora hole output paoya jabe.
        //Ar jodi subclass gulo super class theke beshi kono method dharon kore tahole egulo ke access korte hole amader
        // ekhane dekhano niyom onujayi down casting korte hobe.


        //below casting called as Down Casting
        BideshiDog bideshiDog = (BideshiDog) dog3;
        System.out.println("Name :"+bideshiDog.getName());

        //or we can also like this
        System.out.println("Again get name another way :"+((BideshiDog)dog3).getName());


        //down cast korte hole amader sure hote hobe, je type(dog3) a amra cast korte chassi sei type and tar object type(new BidesheDog) same kina?
        //below upaye amra test kore sure hote pari.
        if (dog3 instanceof BideshiDog){
            BideshiDog bideshiDog1 = (BideshiDog) dog3;
            System.out.println("Is an instanceof BideshiDog?Ans: Yes "+bideshiDog1.getName()+"is a instance of BideshiDog class.");
        }
    }
}

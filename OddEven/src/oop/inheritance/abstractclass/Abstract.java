package oop.inheritance.abstractclass;

public class Abstract {
    public static void main(String[] args) {
        RequestOne requestOne = new RequestOne();
        requestOne.sendRequest();

        RequestTwo requestTwo = new RequestTwo();
        requestTwo.sendRequest();

        RequestThree requestThree = new RequestThree();
        requestThree.sendRequest();
    }
}
abstract class Abstract_Test{
   abstract void sendRequest();
}
class RequestOne extends Abstract_Test{
    @Override
   public void sendRequest(){
        System.out.println("I would like to send request to neat roots.");
       System.out.println("");
    }

}
class RequestTwo extends Abstract_Test{
    @Override
    public void sendRequest(){
        System.out.println("Please help us by providing all information regarding android development.");
    }
}
class RequestThree extends Abstract_Test{
    @Override
    public void sendRequest(){
        System.out.println("I will follow your all info.");
    }
}

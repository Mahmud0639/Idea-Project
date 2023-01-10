import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]){

        Scanner myInput = new Scanner(System.in);

        int number;

        System.out.print("Enter a positive integer number : ");

        number = myInput.nextInt();

        if (number%2 == 0){
            System.out.println(number+ " is an Even number.");
        }else {
            System.out.println(number+ " is an Odd number.");
        }
    }
}

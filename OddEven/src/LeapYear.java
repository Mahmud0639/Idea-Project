import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){

        Scanner getInput = new Scanner(System.in);

        int number;

        System.out.print("Enter your year : ");

        number = getInput.nextInt();

        if (number%400 == 0){
            System.out.println(number + " is a Leap Year.");
        }else if (number%4 == 0 && number%100 != 0 ){
            System.out.println(number+ " is a Leap Year.");
        }else {
            System.out.println(number+ " is not a Leap Year.");
        }
    }
}

package array;

import java.util.Scanner;

public class ArraySumForPrac {
    public static void main(String[] args) {
        int sum = 0;
        int[] number = new int[5];
        System.out.print("Please enter 5 values respectively ");
        Scanner getInput = new Scanner(System.in);

        for (int i = 0; i<5; i++){
            number[i] = getInput.nextInt();
            sum = sum + number[i];
        }
        System.out.println(sum);
    }
}

package array;

import java.util.Scanner;

public class ArraySumUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 5 number ");
        int[] value = new int[5];
        int sum= 0;

        for (int i = 0; i<5; i++){
            //also we can use for(int i = 0; i<value.length; i++
            value[i] = input.nextInt();
            sum = sum+value[i];
        }
        System.out.println(sum);
    }
}

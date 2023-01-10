package array;

public class ArrayUsingForLoop {
    public static void main(String[] args) {
        int[] number = new int[5];
        for (int i = 0; i<5; i++){
            number[i] = i;
        }

        System.out.println(number[4]);
        System.out.println("The size of the array is "+number.length);

    }
}

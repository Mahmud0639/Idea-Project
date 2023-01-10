package factorial;

public class FactorialUsingWhile {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int x = 1;

        while (i<=n){
            x = x*i;
            i++;

        }
        System.out.println(x);
    }
}

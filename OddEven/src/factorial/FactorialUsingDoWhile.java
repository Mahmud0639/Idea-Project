package factorial;

public class FactorialUsingDoWhile {
    public static void main(String[] args) {
        int i = 1;
        int n = 7;
        int x = 1;
        do {
            x = x*i;
            i++;

        }while (i<=n);
        System.out.println(x);
    }
}

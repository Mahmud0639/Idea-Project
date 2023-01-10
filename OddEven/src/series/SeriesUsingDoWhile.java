package series;

public class SeriesUsingDoWhile {
    public static void main(String[] args) {
        int i = 1;
        int n = 9;
        int x = 0;
        do {
            x = x+i;
            i++;
        }while (i<=n);
        System.out.println(x);
    }
}

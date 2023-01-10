package series;

public class SeriesUsingWhile {
    public static void main(String[] args) {
        int i = 1;
        int n = 9;
        int x = 0;
        while (i<=n){
            x = x+i;
            i++;
        }
        System.out.println(x);
    }
}

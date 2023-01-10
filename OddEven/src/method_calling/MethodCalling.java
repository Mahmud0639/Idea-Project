package method_calling;

public class MethodCalling {
    public static void main(String[] args) {
        addValue(3,12,33);
        subValue(24,12);
        mulValue(20,20);
        divValue(36,3);
    }
    public static void addValue(int x, int y, int z){
        int result = x+y+z;
        System.out.println("The addition of three value is : "+result);
        System.out.println("");
    }
    public static void subValue(int l, int m){
        int result = l-m;
        System.out.println("The subtraction of two value is : "+result);
        System.out.println("");
    }
    public static void mulValue(int j, int k){
        int result = j*k;
        System.out.println("The multiplication of two value is : "+result);
        System.out.println("");
    }
    public static void divValue(int e, int f){
        int result = e/f;
        System.out.println("The division of two value is : "+result);
    }
}

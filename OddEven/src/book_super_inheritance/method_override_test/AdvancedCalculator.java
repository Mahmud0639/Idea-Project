package book_super_inheritance.method_override_test;

public class AdvancedCalculator extends Calculator{

    @Override
    public Integer add(Integer x, Integer y) {
        if (x == null || y == null) {
            System.out.println("Argument can't be null");
            return 0;
//        }else {
//            return x+y;
//
//        }
        }
        return x+y;
    }

}

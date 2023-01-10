package abstractexample.practice2;

public class Circle extends Shape{
    Circle(double r){
        super(r);
    }
    void areaCount(){
        double result = 3.1416*dim1*dim1;
        System.out.println("Area of Circle is : "+result);
    }
}

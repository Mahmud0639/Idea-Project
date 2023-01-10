package abstractexample.practice2;

public class Triangle extends Shape{
    Triangle(double value1, double value2){
        super(value1, value2);
    }
    void areaCount(){
        double result = 0.5*dim1*dim2;
        System.out.println("Area of Triangle is : "+result);
    }
}

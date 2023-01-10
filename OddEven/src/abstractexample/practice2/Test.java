package abstractexample.practice2;

public class Test {
    public static void main(String[] args) {
        Shape shape;
        shape = new Rectangle(10,18);
        shape.areaCount();


        shape = new Triangle(20,27);
        shape.areaCount();

        shape = new Circle(3.2);
        shape.areaCount();
    }
}

package abstractexample.practice;

public class Test {
    public static void main(String[] args) {
        Shape shape;
        shape = new Rectangle(10,15);
        shape.area();

        shape = new Triangle(15,10);
        shape.area();

        shape = new Circle(3.93);
        shape.area();
    }
}

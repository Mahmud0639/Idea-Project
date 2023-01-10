package book_super_inheritance.covariant_return_type;

public class CircleFactory extends ShapeFactory{
    public Circle newShape(){
        Circle circle = new Circle();
        return circle;
    }
}

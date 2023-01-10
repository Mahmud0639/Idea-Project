package book_super_inheritance.covariant_return_type;

public class ShapeFactory {
    public Shape newShape(){
        Shape shape = new Shape();
        shape.x = 10;
        shape.y = 20;
        shape.z = 30;
        return shape;
    }

    public static void main(String[] args) {
        ShapeFactory shapeFactory  = new ShapeFactory();

//        int x = shapeFactory.newShape().x;
//        int y = shapeFactory.newShape().y;
//        int z = shapeFactory.newShape().z;

        System.out.println("Shape data: "+shapeFactory.newShape().x+", "+shapeFactory.newShape().y+", "+shapeFactory.newShape().z);
        //shapeFactory.newShape();
    }
}

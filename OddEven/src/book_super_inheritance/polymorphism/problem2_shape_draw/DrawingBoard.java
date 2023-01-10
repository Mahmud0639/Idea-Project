package book_super_inheritance.polymorphism.problem2_shape_draw;

public class DrawingBoard {
    public void draw(Shape shape){
        System.out.println("Drawing a shape :"+shape.getName());
        String typeName = shape.getClass().getTypeName();
        String superClassType = shape.getClass().getSuperclass().getTypeName();

        System.out.println("TypeName :"+typeName);
        System.out.println("SuperClassTypeName :"+superClassType);
    }
}

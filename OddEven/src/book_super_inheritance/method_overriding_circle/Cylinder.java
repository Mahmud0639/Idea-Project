package book_super_inheritance.method_overriding_circle;

public class Cylinder extends Circle{
//    public static void main(String[] args) {
//        Cylinder cylinder = new Cylinder();
//      double z =  cylinder.getArea();
//        System.out.println("Area is : "+z);
//
//
//    }
    double height,area2;
    public Cylinder(){
        this.height = 1.0;
        this.area2 = super.getArea();
    }

    public Cylinder(double radius, String color, double height){
        super(radius,color);
        this.height = height;
    }

    @Override
    public double getArea(){
        double area = 2*Math.PI * radius * height + 2 * super.getArea();
        return area;

    }

    public double getVolume(double height){
        return super.getArea()*height;
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();


        double result = cylinder.getArea();
        System.out.println("Result of cylinder is "+result);
        System.out.println("Result of super class getMethod is : "+cylinder.area2);
        System.out.println("Cylinder volume is : "+cylinder.getVolume(5.2));
    }
}

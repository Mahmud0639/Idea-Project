package RecCirTriSqa;

public class AreaCount {
    public static void main(String[] args) {
        String areaCountName = "Circle";

        switch (areaCountName){
            case "Rectangle":
                double height = 8.2;
                double width = 2.5;
                System.out.println("The area of rectangle is "+height*width);
                break;
            case "Circle":
                double radius = 4.8;
                System.out.println("The area of circle is "+Math.PI*radius*radius);
                break;
            case "Triangle":
                double verticalHeight = 5.2;
                double base = 3.8;
                System.out.println("The area of triangle is "+0.5*verticalHeight*base);
                break;
            case "Square":
                double length = 5.4;
                System.out.println("The area of square is "+length*length);
                break;
            default:
                System.out.println("Invalid input");

        }
    }

}

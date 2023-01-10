package constructors.overloading_constructor;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.displayInfo();

        System.out.println("");

        Teacher teacher1 = new Teacher("Mahmud","Male");
        teacher1.displayInfo();

        System.out.println("");

        Teacher teacher2 = new Teacher("Nasima","Female",939393);
        teacher2.displayInfo();
    }
}

package constructors;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Mahmud Bappi","27",1);
        student.displayInfo();

        System.out.println("");

        Student student1 = new Student("Fatima Akter","19",2);
        student1.displayInfo();
    }
}

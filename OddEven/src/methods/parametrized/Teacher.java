package methods.parametrized;

public class Teacher {
    String name, gender;
    int phone;

    void displayInfo(String n, String g, int p){
        name = n;
        gender = g;
        phone = p;

        System.out.println("Teacher name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);
    }
}

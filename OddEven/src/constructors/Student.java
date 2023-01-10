package constructors;

public class Student {
    String name, age;
    int id;

    Student(String name, String age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    void displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Id : "+id);
    }
}

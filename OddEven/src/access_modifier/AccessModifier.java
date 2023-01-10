package access_modifier;

public class AccessModifier {
    public static void main(String[] args) {
        ClassForPrivate forPrivate  = new ClassForPrivate();
        forPrivate.printName();
       /* here only method can be accessed by object
        but private member can not be accessed by object*/


        ClassForPublic forPublic = new ClassForPublic();
        forPublic.name = "Mahmud Bappi";
        forPublic.printName();

        ClassForProtected forProtected = new ClassForProtected();
        forProtected.name = "Mahmud Islam";
        forProtected.printName();

       /* It can be accessed in same package but not accessible from other package easily.
        To access from different packages we need to import that package and inherit(extends) that class*/
    }
}
class ClassForPrivate{
    private String name;
    void printName(){
        System.out.println("My name is "+name);
    }
}
class ClassForPublic{
    public String name;
    void printName(){
        System.out.println("My name is "+name);
    }
}
class ClassForProtected{
    protected String name;
    void printName(){
        System.out.println("My name is "+name);
    }
}

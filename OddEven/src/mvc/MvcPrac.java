package mvc;



public class MvcPrac {
    private String rollNo;
    private String name;

    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo){
        this.rollNo = rollNo;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
class StudentView{
    public void printStudentDetails(String studentName, String studentRoll){
        System.out.println("Student: ");
        System.out.println("Name "+studentName);
        System.out.println("Roll "+studentRoll);
    }
}
class StudentController{
    private MvcPrac model;
    private StudentView view;

    public StudentController(MvcPrac model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }
    public String getStudentName(){
        return model.getName();
    }
    public void setStudentRoll(String roll){
        model.setRollNo(roll);
    }
    public String getStudentRoll(){
        return model.getRollNo();
    }
    public void updateView(){
        view.printStudentDetails(model.getName(),model.getRollNo());
    }
}
class MVCPattern{
    public static void main(String[] args) {
        MvcPrac mvcPracModel = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController studentController = new StudentController(mvcPracModel,view);
        studentController.updateView();

        studentController.setStudentName("Fatima Akr");
        studentController.updateView();
    }
    private static MvcPrac retrieveStudentFromDatabase(){
        MvcPrac mvcPracModel = new MvcPrac();
        mvcPracModel.setName("Mahmud Islam");
        mvcPracModel.setRollNo("1743CSE00583");

        return mvcPracModel;
    }
}

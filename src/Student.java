// "Client" class
public class Student {
    private final String name;
    private int testGrade;

    public Student(String name){
        this.name = name;
    }
    public void learn(String topic){
        System.out.println(name + " learned about " + topic + " topic");
    }
    public void receiveGrade(int grade){
        testGrade = grade;
    }
    public void consult(){
        System.out.println(name + " is consulting about having " + testGrade + " for last test");
    }
}

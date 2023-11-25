import java.util.ArrayList;
import java.util.List;

// "Servant" class
public class Professor {
    public String name;
    private String topic;
    private final List<Student> studentList;

    public Professor(String name){
        this.name = name;
        studentList = new ArrayList<>();
    }
    public void attendance(Student s){
        studentList.add(s);
    }
    public void teach(){
        System.out.println("Professor " + name + " is teaching about " + topic + "\n");
        for (Student s: studentList) {
            s.learn(topic);
        }
        System.out.println();
    }
    public void grade(Student s, int grade){
        s.receiveGrade(grade);
    }
    public void consultGrade(Student s){
        s.consult();
    }
    public void setTopic(String topic){
        this.topic = topic;
    }
}

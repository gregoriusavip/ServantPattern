public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("A");

        // today's topic is about servant design pattern
        professor.setTopic("servant design pattern");

        // today's students that come to class
        Student student1 = new Student("Jacob Terrey");
        Student student2 = new Student("Justin Ta");
        Student student3 = new Student("Enoch Chen");
        Student student4 = new Student("David Shahi");
        Student student5 = new Student("Gregorius Avip");
        Student student6 = new Student("Megan Joo");

        // professor is taking attendance
        professor.attendance(student1);
        professor.attendance(student2);
        professor.attendance(student3);
        professor.attendance(student4);
        professor.attendance(student5);
        professor.attendance(student6);

        // professor is teaching
        professor.teach();

        // professor is grading a student's test
        professor.grade(student1, 65);

        // professor is having a talk about a student's grade
        professor.consultGrade(student1);
    }
}
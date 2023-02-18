package Object_class_fundamentals;

public class MainClass {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student(12, "student 1");
        Student student2 = (Student) student1.clone();
        System.out.println(student1.name+" "+student2.name);

    }
}

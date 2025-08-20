import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(2,"harlie"));
        studentList.add(new Student(3,"Charlie"));


        studentList.sort(null);
        System.out.println(studentList);
    }
}

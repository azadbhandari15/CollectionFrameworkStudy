import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsTest {

    public static void main(String[] args) {
        Map<Student,Long> map1=new HashMap<>();
        map1.put(new Student(1,"Alice"),10l);
        map1.put(new Student(2,"Alias"),30l);
        map1.put(new Student(1,"Alice"),30l);

        System.out.println(map1);
    }
}

class Student implements Comparable<Student>{
    private String name;
    private int id;

    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id-o.id;
    }
}

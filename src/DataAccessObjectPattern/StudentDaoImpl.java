package DataAccessObjectPattern;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben Yu on 4/11/15.
 */
public class StudentDaoImpl implements StudentDao {

    //list is working as a database
    List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<Student>();

        Student student1 = new Student("Robert", 0);
        Student student2 = new Student("John", 1);

        students.add(student1);
        students.add(student2);
    }

    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the databse");
    }
}

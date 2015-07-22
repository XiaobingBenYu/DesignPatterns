package DataAccessObjectPattern;
import  java.util.List;

/**
 * Created by Ben Yu on 4/11/15.
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}

import java.util.ArrayList;

/**
 * Represents a register of students.
 * <p> 
 * The following functionality is implemented.
 * <ul>
 *      <li> Search for a student by name. </li>
 *      <li> Add a student </li>
 *      <li> Remove a student </li>
 *      <li> Get number of students </li>
 *      <li> Get a set of students </li>
 *      <li> List all students </li>
 * 
 * <ul>
 * <p>
 *
 * @author Osterie https://github.com/Osterie
 * @version 2023-09-11
 */
public class StudentRegistry
{

    private ArrayList<Student> students;

    /**
     * Creates an instance of StudentRegister.
     */
    public StudentRegistry()
    {
        this.students = new ArrayList<Student>();
    }

    /*
     * Adds a student to the register
     */
    public void addStudent(Student student)
    {
        this.students.add(student);
    }

    /*
     * Returns the number of studens in the register
     * 
     * @return the number of studens in the register
     */
    public int getNumberOfStudents()
    {
        return this.students.size();
    }


    /*
     * Returns the student at a given position in the grister,
     * given by the parameter index
     * 
     * @param index the position of the student in return
     * @return returns the student at the given index
     */
    public Student getStudentAt(int index)
    {
        return this.students.get(index);
    }
}
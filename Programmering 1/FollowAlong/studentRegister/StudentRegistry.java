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

    /*
     * Searches the registry for a student with the given name
     * If no student matching the name is found, null is returned
     * 
     * @param name the name of the student to search for
     * @return the student found with the given name
     */

    public Student findStudentByName(String name)
    {
        Student foundStudent = null;
        int index = 0;
        while ( (index < this.students.size() ) && ( foundStudent == null )) 
        {
            Student student = this.students.get(index);

            if (student.getName().equals(name))
            {
                foundStudent = this.students.get(index);
            }
            
            index ++;
        }
        return foundStudent;
    }

    /*
     * Prints all students to the consol window
     */
    public void printAllStudents()
    {
        // For-each
        for (Student student : this.students) 
        {
            System.out.println("Name" + student.getName());
            System.out.println("Age" + student.getAge());
            System.out.println("Student Id" + student.getStudentId());

        }
    }

    /*
     * Fills the register with 8 dummy students for testing purposes only.
     */
    public void fillRegisterWithDummyStudents()
    {
        for (int i = 0; i < 9; i++) 
        {
            Student dummyStudent = new Student("Dummy"+i, 20 + i, "000000");
            this.addStudent(dummyStudent);
        }
    }
}
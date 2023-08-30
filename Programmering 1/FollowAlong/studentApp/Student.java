
/**
 * Represents a student with name, aeg and studentId
 *
 * @author Adrian Gjøsund Bjørge
 * @version 2023-08-28
 */
public class Student
{

    // Felt (Field)
    // Constructor
    // Metoder (Methods)

    // @param studentName Name of student
    // @param studentAge Age of student. Must be a positive number
    // @param studentIndentification Student identification. A 6 digit number, on the form "832950"

    private String name;
    private int age;
    private String studentId;

    public Student(String studentName, int studentAge, String studentIdentification)
    {
        name = studentName;
        age = studentAge;
        studentIdentification = studentId;
    }

    // Returns the age of the student
    // @return The age of the student.
    public int getAge()
    {
        return age;
    }

    // Returns the name of the student
    // @return The name of the student.
    public String getName()
    {
        return name;
    }

    // Returns the student ID of the student
    // @return The student ID of the student.
    public String getStudentId()
    {
        return studentId;
    }

}
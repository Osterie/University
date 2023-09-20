
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
        studentId = studentIdentification;
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

    // Sets age of the student according to the given argument
    // age must be a positive number
    public void setAge(int studentAge)
    {
        if (studentAge >= 0)
        {
            age = studentAge;
        }
        else
        {
            System.out.println("Error: Given age must be a positive number");
        }
    }

    // Sets name of the student according to the given argument
    public void setName(String studentName)
    {
        name = studentName;
    }

    // Sets Student Id of the student according to the given argument
    public void setStudentId(String studentIdentification)
    {
        studentId = studentIdentification;
    }
}
import java.util.ArrayList;

/**
 * Represent the application which can hancle one or more studens and calculate the average age.
 *
 * @author Adrian
 * @version 2023-08-28
 */
public class StudentApp
{

    private void printStudentInfo(Student student)
    {
        System.out.println("Name of student: " + student.getName());
        System.out.println("Age of student: " + student.getAge());
        System.out.println("Student ID of student: " + student.getStudentId());
        System.out.println("Student info: " + "," + student.getName() + "," + student.getAge() + "," +  student.getStudentId());
    }

    public static void main(String[] args)
    {
        StudentApp studentApp = new StudentApp();
        studentApp.start();

    }




    public void start()    
    {
        Student student1 = new Student("Arne", 54, "080808");
        Student student2 = new Student("Arne", 37, "080808");  

        printStudentInfo(student1);
        printStudentInfo(student2);
    }

    public float getAverageAge(ArrayList<Student> students)
    {
        float totalAge = 0;
        float averageAge = 0;

        for (int i = 0; i < students.size(); i++) {
            totalAge += students.get(i).getAge();
        }

        averageAge = totalAge / students.size();

        return averageAge;
    }
}

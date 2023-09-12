import java.util.ArrayList;

/**
 * Represent the application which can hancle one or more studens and calculate the average age.
 *
 * @author Adrian
 * @version 2023-08-28
 */
public class StudentApp
{

    private StudentRegistry studentRegistry;

    public static void main(String[] args) {
        StudentApp studentApp = new StudentApp();
        studentApp.start();
    }
    
    public StudentApp()
    {
        this.studentRegistry = new StudentRegistry();
    }


    public void start()    
    {
        
        // printStudentInfo(student1);
        // printStudentInfo(student2);

        this.studentRegistry.addStudent(new Student("Arne", 54, "080808"));
        this.studentRegistry.addStudent(new Student("Adirank", 37, "029808")); 
        this.studentRegistry.addStudent(new Student("Jens", 23, "329808"));

        //find the student at position 1
        Student foundStudent = this.studentRegistry.getStudentAt(1);

        System.out.println(this.studentRegistry.getNumberOfStudents() + " Number of students");
        System.out.println(this.studentRegistry.getStudentAt(1) + " Student at index 1.");
        System.out.println(this.studentRegistry.getStudentAt(2) + " Student at index 2.");

    }
    
    private void printStudentInfo(Student student)
    {
        System.out.println("Name of student: " + student.getName());
        System.out.println("Age of student: " + student.getAge());
        System.out.println("Student ID of student: " + student.getStudentId());
        System.out.println("Student info: " + "," + student.getName() + "," + student.getAge() + "," +  student.getStudentId());
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

import java.util.ArrayList;

/**
 * Represent the application which can hancle one or more studens and calculate the average age.
 *
 * @author Adrian
 * @version 2023-08-28
 */
public class StudentApp
{

    
    public static void main(String[] args)
    {
        Student student1 = new Student("Arne", 54, "080808");
        Student student2 = new Student("Arne", 37, "080808");  

        System.out.println("Name of student #1: " + student1.getName());
        System.out.println("Name of student #2: " + student2.getName());


    }

    public void pritnShit()
    {
        // ArrayList<Student> arrayList = new ArrayList<Student>();  
        // arrayList.add(this.student1); 
        // arrayList.add(this.student2); 
        // System.out.println("The average age of the students is: " + this.getAverageAge(arrayList));

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

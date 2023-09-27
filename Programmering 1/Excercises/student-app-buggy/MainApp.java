
/**
 * <p>
 * Represents the starting point of the application. This class
 * is responsible for starting/running the entire application
 * by using objects from other classes in the project. In this case
 * the Student-class.
 * 
 * <p>
 * As you can see, this class only have 1 method: main(), which is the main
 * starting point for this application.
 * 
 * <p>
 * In this version, the main()-method is a bit special. When we want to run an
 * application
 * on an operating system (OS), the OS expects to find a starting point in terms
 * of a method
 * with a specific name and signatur. Also, it must be possible to <b>call the
 * method directly</b>
 * from the class, without having to create an object first. Hence the
 * main()-method should
 * have the following signature (form):
 * <p>
 * 
 * <pre>
 *       public static void main(String[] args)
 * </pre>
 * 
 * <p>
 * <b>ALWAYS!</b>
 * 
 * <p>
 * To "run" the application from BlueJ:
 * <ul>
 * <li>right-click the class (do not create an object), and select the class
 * method main(),
 * and the application runs.</li>
 * <li>Observe the output in the terminal window in BlueJ.</li>
 * </ul>
 * 
 * <p>
 * To run the application from the command/terminal window in Windows/Mac/Linux:
 * <ul>
 * <li>First create a JAR-file of your project: In BlueJ, choose the File-menu,
 * and select
 * "Create JAR file". Give the file a nema ("student-demo" for example), and
 * decide where to save it to (can
 * be saved in the same folder as the BlueJ project).</li>
 * <li>Open the commandline/terminal window on your computer</li>
 * <li>move to the folder where the generated JAR-file was saved (using the
 * "cd"-command)</li>
 * <li>Type the following on the commandline
 * 
 * <pre>
 * 
 *       java -cp student-demo.jar MainApp
 * </pre>
 * 
 * and hit the enter-key</li>
 * 
 * </ul>
 * 
 * Observe the output in the command/terminal window.
 *
 * @author Arne Styve
 * @version 2021-09-02
 */
public class MainApp {
    public static void main(String[] args) {

        Student student1 = null;
        Student student2 = null;
        Student student3 = null;

        student1 = new Student("Jens", 24);
        student2 = new Student("Lisa", 22);
        student3 = new Student("Jon", 23);

        // Let the students print their details
        student1.printDetails();
        student2.printDetails();
        student3.printDetails();

        // Calculate average age. Note that in order for the calculation to return
        // a decimal value from the division, you must divide by a floating point
        // number,
        // not an integer. Hence we use 3.0 and not just 3.
        // The primitive datatype double is a 64 bit floating point type.
        double averageAge = (student1.getAge() + student2.getAge() + student3.getAge()) / 3.0;

        System.out.println("Average age: " + averageAge);

    }
}

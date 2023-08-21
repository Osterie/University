public class QuickStart {
    
    public static void main (String[] args) {
        System.out.println("Hello, World.");
    }
    void printType(byte x) {
        System.out.println(x + " is an byte");
    }
    void printType(int x) {
        System.out.println(x + " is an int");
    }
    void printType(float x) {
        System.out.println(x + " is an float");
    }
    void printType(double x) {
        System.out.println(x + " is an double");
    }
    void printType(char x) {
        System.out.println(x + " is an char");
    }
}


Typetester t = new Typetester();
t.printType( yourVariable );
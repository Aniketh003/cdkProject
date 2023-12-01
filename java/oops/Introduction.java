class Student{
    int rol; // Default is 0
    String name;
    float marks = 10.3f; // Default for every Instance of the object is 10.3

    Student(){
        // this("Aniketh",12,34.33f); -> Calling another constructor
    }

    Student(String name,int rol,float marks){
        // this -> this keyword is used to refer to the current object (The object which called the constructor)
        this.name = name;
        this.rol = rol;
        this.marks = marks;
    }
}
public class Introduction {
    public static void main(String[] args) {

        Student aniketh; // Refered to the class but not initialised
        aniketh = new Student(); // Object aniketh is initialised (Memory allocated and can be used)
        
        // Student() -> Constructor (It is called whenever an objeect is created)
        // By default the constructor initialses all the values of the class to 0 and null

        //Default Values are printed
        System.out.println("Default values");
        System.out.println(aniketh.rol);
        System.out.println(aniketh.name);
        System.out.println(aniketh.marks);

        
        //Values Declared
        
        aniketh.rol  = 12;
        aniketh.name  = "Aniketh";
        aniketh.marks = 12.56f;
        
        System.out.println(aniketh.rol);
        System.out.println(aniketh.name);
        System.out.println(aniketh.marks);

        // Initialising values with a constructor
        Student aniketh1 = new Student("Aniketh",12,34.6f);
        System.out.println(aniketh1.rol);
        System.out.println(aniketh1.name);
        System.out.println(aniketh1.marks);
    }

    public static void message(String[] args) {
        System.out.println("Hello from message");
    }

}
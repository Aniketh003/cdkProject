class Human{
    int age;
    String name;
    int salary;
    static long population; // static variables are used to access the varible without any object
    // We can access or update the static varible without object,It has no relation with object

    static void message(){
        System.out.println("Hello world");
        // System.out.println(this.age); // cant use "this" over here
        // cause static is independent of object and using "this" is useless
        //"this" refers to the object

    }
    Human(int age,String name,int salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population += 1;

        message();//This works
        Human.message();//This works aswell
    }
}

public class Static {
    public static void main(String[] args) {
        Human one = new Human(12, null, 4545);
        Human two = new Human(12, null, 4545);
        Human three = new Human(12, null, 4545);
        //System.out.println(Human.name); // -> This will give an error cause, name is non static and need an object to access it
        System.out.println(Human.population); // -> population is static and does not require an object to run
        //System.out.println(two.population); // -> This also works
        System.out.println(one.name);
        System.out.println(two.name);
        System.out.println(three.name);
        // message(); -> This will give an error because message is non static and need an object
        
        //Create an object and access the message
        // Static s = new Static();
        // s.message();

        // message2(); -> This will run because it is static an ddont need a class 
    }
    
    void fun(){
        System.out.println("Inside fun method");
        message(); // This will workd because when an non-static funcion is runned it can also run the outher non static methods
        // If the fun() is static then message() will not work
    }

    void message(){
        System.out.println("I am a message"); // Needs an object to run
    }
    
    static void message2(){
        System.out.println("I am a message");
    }
}
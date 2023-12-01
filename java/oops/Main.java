public class Main {
    public static void main(String[] args) {
        //Different parameter constructors
        Box b = new Box();
        System.out.println(b.l + " " + b.h + " " + b.w);

        // Box c = new Box(2);
        // System.out.println(c.l + " " + c.h + " " + c.w);
        
        // Box copy = new Box(c); // Copy constructor called
        // System.out.println(copy.l + " " + copy.h + " " + copy.w);
        
        Box2 w = new Box2(12, 34, 3, 10);
        System.out.println(w.l + " " + w.h + " " + w.weight);
    }
}

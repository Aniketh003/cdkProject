class Box {
    float l;
    float h;
    float w;

    Box() { // 0 parameter constructor
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(float side) { // 1 parameter constructor
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(float l, float h, float w) { // 3 parameter constructor
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box copy) {
        this.l = copy.l;
        this.h = copy.h;
        this.w = copy.w;
    }

}

class Box2 extends Box {
    double weight;

    Box2(float l, float h, float w, double weight) {
        super(l, h, w); // calls the constructor of the parent class
        this.weight = weight;
    }
}

/**
 * Inheritance
 */
public class Inheritance {
    public static void main(String[] args) {

    }

}
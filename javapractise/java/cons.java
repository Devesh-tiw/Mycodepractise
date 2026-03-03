
public class cons {

    double length;
    double width;
    double height;

    // Default constructor
    cons() {
        length = 1;
        width = 1;
        height = 1;
    }

    // Constructor with 3 parameters
    cons(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    // Constructor with one parameter (cube)
    cons(double l) {
        length = width = height = l;
    }

    // Method to calculate volume
    double volume() {
        return length * width * height;
    }

    public static void main(String[] args) {

        cons c1 = new cons();            // default
        cons c2 = new cons(2, 3, 4);     // rectangle box
        cons c3 = new cons(5);           // cube

        System.out.println("Volume c1 = " + c1.volume());
        System.out.println("Volume c2 = " + c2.volume());
        System.out.println("Volume c3 = " + c3.volume());
    }
}

// Base class
class cal {
    int a;
    int b;

    // Constructor
    cal() {
        a = 0;
        b = 0;
    }

    // Setter
    public void setAdd(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Getter for addition
    public int getAdd() {
        return a + b;
    }
}

// Derived class
class subcal extends cal {

    // Method for subtraction
    public int getSub() {
        return a - b;
    }
}

// Main class
public class inheritance_3 {
    public static void main(String[] args) {
        subcal s = new subcal();

        // Set values
        s.setAdd(20, 10);

        // Perform operations
        System.out.println("Addition: " + s.getAdd());
        System.out.println("Subtraction: " + s.getSub());
    }
}

// ClassCastException:
//Demonstrate an invalid type cast.

class Parent {
    void display() {
        System.out.println("This is the Parent class.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the Child class.");
    }
}

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        try {
            // Creating a Parent class object
            Parent parent = new Parent();

            // Attempting to cast Parent to Child (invalid cast)
            Child child = (Child) parent;

            child.show(); // This line won't execute due to the exception

        } catch (ClassCastException e) {
            // Handling the ClassCastException
            System.out.println("Exception Caught: " + e.getMessage());
            System.out.println("Invalid type casting detected.");
        } finally {
            System.out.println("Execution of the try-catch block is complete.");
        }
    }
}

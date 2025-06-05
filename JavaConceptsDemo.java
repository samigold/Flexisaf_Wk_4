// Java deliverable demonstrating classes, object instantiation, method and variable access, nested and inner classes, access control, enums, and quizzes/exercises.

public class JavaConceptsDemo {
    // Enum declaration
    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    // Outer class variable
    private String message = "Hello from JavaConceptsDemo!";

    // Constructor
    public JavaConceptsDemo() {
        System.out.println("JavaConceptsDemo object created.");
    }

    // Method to access variable
    public void showMessage() {
        System.out.println(message);
    }

    // Static nested class
    public static class StaticNested {
        public void display() {
            System.out.println("Inside Static Nested Class");
        }
    }

    // Inner class
    public class Inner {
        public void display() {
            System.out.println("Inside Inner Class. Outer message: " + message);
        }
    }

    // Access control demonstration
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Quiz/Exercise Section
    public static void quiz() {
        System.out.println("\n--- Quiz Section ---");
        System.out.println("1. What is the difference between a static nested class and an inner class?");
        System.out.println("2. How do you instantiate an inner class?");
        System.out.println("3. What is the purpose of access modifiers in Java?");
        System.out.println("4. Write an enum for the four seasons.");
    }

    public static void main(String[] args) {
        // Object instantiation
        JavaConceptsDemo demo = new JavaConceptsDemo();
        demo.showMessage();

        // Accessing methods with different access controls
        demo.publicMethod();
        demo.protectedMethod();
        // demo.privateMethod(); // Uncommenting this line will cause a compile error

        // Instantiating static nested class
        StaticNested staticNested = new StaticNested();
        staticNested.display();

        // Instantiating inner class
        Inner inner = demo.new Inner();
        inner.display();

        // Using enum
        Day today = Day.THURSDAY;
        System.out.println("Today is: " + today);

        // Quiz/Exercise
        quiz();
    }
}

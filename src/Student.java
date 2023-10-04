public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // Create instances of the Student class
        Student sam = new Student("Sam");
        Student john = new Student("John");

        // Accessing student names
        System.out.println("Student 1: " + sam.getName());
        System.out.println("Student 2: " + john.getName());
    }
}

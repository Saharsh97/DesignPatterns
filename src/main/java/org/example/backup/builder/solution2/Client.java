package org.example.backup.builder.solution2;

public class Client {
    public static void main(String[] args) {
        // 1. This Builder is Specific to the Student?
        // so logically, can I ask Student class to give me Builder for it.

        // similar logic I can apply to Batch class.
        // If I want to create a Batch object,
        // I want Batch to give me its own specific builder.

        // 1soln.

        // 2. can we actually call the getBuilder()?
        // we first need an object of Student first.

        // 2soln.

        // 3
        Builder temp = Student.getBuilder();
        temp.setId(1);
        temp.setName("Saharsh");
        temp.setAge(27);
        temp.setBatch("Aug23 Morning");
        temp.setGradYear(2025);
        temp.setPsp(90.0);
        Student student1 = new Student(temp);

        // 4. You get Builder by calling Student.
        // You again give the Builder to Student, and then get the Builder object.
        // Visualize on Notes, it is not a circle.

        // Students gives you a Builder.
        // You set the values in a Builder.
        // call the Builder to make a Student Object, out of its own values.
        // 4soln2
        Builder builder = Student.getBuilder();
        builder.setId(1);
        builder.setName("Saharsh");
        builder.setAge(27);
        builder.setBatch("Aug23 Morning");
        builder.setGradYear(2025);
        builder.setPsp(90.0);
        Student student2 = builder.build();

        // 5. Debug and show the flow.
        // readable.
        System.out.println("DEBUG");
    }
}

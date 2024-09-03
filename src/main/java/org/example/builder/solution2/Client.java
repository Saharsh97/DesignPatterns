package org.example.builder.solution2;

public class Client {
    public static void main(String[] args) {
        // because the builder is specific to only a Student.
        // the Student should give me a Builder object.
        // I will set the values in the object given by student
        // then I will pass the object back to Student for validation and creation

        Builder builder = Student.getBuilder();
        builder.setId(1);
        builder.setName("Saharsh");
        builder.setAge(27);
        builder.setBatch("Aug23 Morning");
        builder.setGradYear(2025);
        builder.setPsp(90.0);

        // builder itself has enough info, to create the Student
        // why do I need to call Student and pass builder to it? I dont need to do this.
        // builder can itself can create the student object.

        Student student = builder.build();
        Student x = new Student(null);

        System.out.println("DEBUG");
    }
}

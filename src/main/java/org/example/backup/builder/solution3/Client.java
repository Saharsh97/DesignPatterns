package org.example.backup.builder.solution3;


public class Client {
    public static void main(String[] args) {
        // 6. Now following SRP, A student should be able to create itself!
        // Who is creating the Student? Builder
        // so Shouldn't the Builder be a part of Student class? Yes.


        // 9. now how can the client create the object of Student?
        Student student = Student.getBuilder().build();

        // 10. what if I want this.
        Student student1 = Student.getBuilder()
                        .setName("Saharsh")
                        .setId(10)
                        .setAge(27)
                        .build();
        // this is plain simple english!

    }
}

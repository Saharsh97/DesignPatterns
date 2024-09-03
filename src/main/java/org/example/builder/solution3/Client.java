package org.example.builder.solution3;

public class Client {
    public static void main(String[] args) {
         Student student = Student.getBuilder()
                                .setId(1)
                                .setName("Saharsh")
                                .setAge(27)
                                .setBatch("Aug Morning")
                                .build();

         Student st2 = Student.getBuilder()
                         .setId(20)
                         .setName("Navdeep")
                         .setAge(25)
                         .setPsp(99.8)
                         .build();
        System.out.println(st2.getName());
        System.out.println("DEBUG");
    }
}

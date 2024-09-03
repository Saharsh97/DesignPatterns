package org.example.builder.solution1;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setId(1);
        builder.setName("Saharsh");
        builder.setAge(27);
        builder.setBatch("Aug23 Morning");
        builder.setGradYear(2025);
        builder.setPsp(90.0);

        Student student = new Student(builder);

        System.out.println("DEBUG");
    }
}

package org.example.builder.solution2;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String batch;
    private String phoneNumber;
    private Double psp;
    private Integer gradYear;

    public static Builder getBuilder(){
        return new Builder();
    }

    Student(Builder builder) {
        if(builder.getAge() < 20){
            throw new RuntimeException("Age must be greater than 20");
        }
        if(builder.getPsp() < 0.0){
            throw new RuntimeException("Psp must be greater than 0");
        }
        if(builder.getGradYear() < 2022){
            throw new RuntimeException("GradYear must be greater than 2022");
        }

        this.id = builder.getId();
        this.name = builder.getName();
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.phoneNumber = builder.getPhoneNumber();
        this.psp = builder.getPsp();
        this.gradYear = builder.getGradYear();
    }
}

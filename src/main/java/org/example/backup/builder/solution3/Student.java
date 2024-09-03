package org.example.backup.builder.solution3;

import lombok.Getter;
import lombok.Setter;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String batch;
    private String phoneNumber;
    private Double psp;
    private Integer gradYear;

    // 1Soln:
    // 2soln:
    public static Builder getBuilder(){
        return new Builder();
    }

    // 7. make the constructor private.
    // As you want only Builder to call it.
    // no one can create Student directly outside.
    private Student(Builder builder) {

        // 8. lets move the validation inside the Builder class.
        // when you are building it, then you check the values.
        // keep the Logic of Student to only copy the verified values
        // from builder to here.

        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.batch = builder.batch;
        this.phoneNumber = builder.phoneNumber;
        this.psp = builder.psp;
        this.gradYear = builder.gradYear;
    }


    // 6soln. Move Builder to Student, public and static class.
    // run code.
    public static class Builder {
        private Integer id;
        private String name;
        private Integer age;
        private String batch;
        private String phoneNumber;
        private Double psp;
        private Integer gradYear;

        Builder(){

        }

        public Builder setId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setPsp(Double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setGradYear(Integer gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        // 8soln.
        public Student build(){
            // first verify all the values.
            if(this.age < 20){
                throw new RuntimeException("Age must be greater than 20");
            }
            if(this.psp < 0.0){
                throw new RuntimeException("Psp must be greater than 0");
            }
            if(this.gradYear < 2022){
                throw new RuntimeException("GradYear must be greater than 2022");
            }

            // then create the Student object freely.
            return new Student(this);   // new student from myself.
        }
    }
}

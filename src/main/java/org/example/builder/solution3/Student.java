package org.example.builder.solution3;

// this class should have all the logic to create itself
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String batch;
    private String phoneNumber;
    private Double psp;
    private Integer gradYear;
    private String email;

    public static Builder getBuilder(){
        return new Builder();
    }

    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.batch = builder.batch;
        this.phoneNumber = builder.phoneNumber;
        this.psp = builder.psp;
        this.gradYear = builder.gradYear;
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getBatch() {
        return batch;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Double getPsp() {
        return psp;
    }

    public Integer getGradYear() {
        return gradYear;
    }

    public String getEmail() {
        return email;
    }

    public static class Builder {
        private Integer id;
        private String name;
        private Integer age;
        private String batch;
        private String phoneNumber;
        private Double psp;
        private Integer gradYear;
        private String email;

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

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Student build(){
            if(age < 20){
                throw new RuntimeException("Age must be greater than 20");
            }
            if(psp < 0.0){
                throw new RuntimeException("Psp must be greater than 0");
            }
            if(gradYear < 2022){
                throw new RuntimeException("GradYear must be greater than 2022");
            }
            if(email != null && email.length() < 5){
                throw new RuntimeException("Email must be at least 5 characters");
            }
            return new Student(this);
        }
    }
}

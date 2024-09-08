package org.example.prototypes;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private String city;
    private double avgPsp;
    private String batch;
    private String instructorName;
    private String password;
    private String phoneNumber;

    public Student(){}

    public Student(Student x){
        this.name = x.name;
        this.age = x.age;
        this.city = x.city;
        this.avgPsp = x.avgPsp;
        this.batch = x.batch;
        this.instructorName = x.instructorName;
        this.password = x.password;
        this.phoneNumber = x.phoneNumber;
    }

    @Override
    public Student copy() {
        return new Student(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAvgPsp(double avgPsp) {
        this.avgPsp = avgPsp;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public double getAvgPsp() {
        return avgPsp;
    }

    public String getBatch() {
        return batch;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getPassword() {
        return password;
    }
}

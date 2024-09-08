package org.example.backup.prototypes;

public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private String city;
    private double avgPsp;
    private String batch;
    private String instructorName;

    Student(){

    }

    Student(String name, int age, String city, double avgPsp, String batch, String instructorName) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.avgPsp = avgPsp;
        this.batch = batch;
        this.instructorName = instructorName;
    }

    Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.city = student.city;
        this.avgPsp = student.avgPsp;
        this.batch = student.batch;
        this.instructorName = student.instructorName;
    }

    @Override
    public Student clone() {
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

    public void setAvgPsp(double psp) {
        this.avgPsp = psp;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
}

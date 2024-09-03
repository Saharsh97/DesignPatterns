package org.example.backup.builder.problem;

public class Student {
    private Integer id;
    private String name;
    private String email;
    private String batch;
    private Double psp;

    // either you make 2^n combinations of Constructors
    // validations is an issue.

    // or you make Telescopic Constructors -> N constructors.
    // validation is an issue.

    public Student(Integer id){
        this(id, null);
    }

    public Student(Integer id, String name){
        this(id, name, null);
    }

    public Student(Integer id, String name, String email) {
        this(id, name, email, null);
    }

    public Student(Integer id, String name, String email, String batch) {
        this(id, name, email, batch, null);
    }

    public Student(Integer id, String name, String email, String batch, Double psp) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.batch = batch;
        this.psp = psp;
    }
}

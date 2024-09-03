package org.example.builder.problem;

public class Student {
    private Integer id;
    private String name;
    private String email;
    private String batch;
    private Double psp;
    private Integer gradYear;

//    Student(int id, String name){
//        // validation
//        if(id < 0){
//            throw new RuntimeException("id is less than 0");
//        }
//        // ....
//
//        this.id = id;
//        this.name = name;
//    }

    // either you make 2^N combinations of Constructors
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
        this(id, name, email, batch, psp, null);
    }

    public Student(Integer id, String name, String email, String batch, Double psp, Integer gradYear) {
        // psp > 0
        if(gradYear < 2020){
            throw new RuntimeException("psp is less than 0");
        }
        // id > 0
        // gradYear > 2024

        this.id = id;
        this.name = name;
        this.email = email;
        this.batch = batch;
        this.psp = psp;
    }
}

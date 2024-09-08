package org.example.prototypes;


public class Client {

    public static StudentRegistry populateAndGetStudentRegistry(){
        StudentRegistry studentRegistry = new StudentRegistry();
        Student baseStudentForAug23 = new Student();
        baseStudentForAug23.setBatch("August Awesome 2023 Batch");
        baseStudentForAug23.setAvgPsp(80.0);
        baseStudentForAug23.setInstructorName("Saharsh Singh");
        studentRegistry.register("Aug23Batch", baseStudentForAug23);

        Student baseStudentForNov24 = new Student();
        baseStudentForNov24.setBatch("August Nov 24 Batch");
        baseStudentForNov24.setAvgPsp(90.0);
        baseStudentForNov24.setInstructorName("Teju");
        studentRegistry.register("Nov24Batch", baseStudentForNov24);

        // .... create n number of base objects.
        return studentRegistry;
    }


    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Saharsh");
        st.setAge(27);
        st.setCity("Mumbai");

        Student copy = st.copy();


        IntelligentStudent is = new IntelligentStudent();
        is.setName("Navdeep");
        is.setAge(27);
        is.setCity("Mumbai");
        is.setBatch("Aug Morning");
        IntelligentStudent copyIs = is.copy();

        StudentRegistry studentRegistry = populateAndGetStudentRegistry();
        Student st1 = studentRegistry.get("Aug23Batch");
        st1.setName("Rajeev");
        st1.setAge(25);
        st1.setCity("Mumbai");

        Student st2 = studentRegistry.get("Aug23Batch");
        st2.setName("Karthik");
        st2.setAge(25);
        st2.setCity("Bangalore");

        Student st3 = studentRegistry.get("Nov24Batch");
        st3.setName("Navdeep");
        st3.setAge(25);
        st3.setCity("Delhi");

        System.out.println("DEBUG");




    }
}

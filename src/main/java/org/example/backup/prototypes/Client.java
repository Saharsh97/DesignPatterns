package org.example.backup.prototypes;

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
        baseStudentForNov24.setAvgPsp(80.0);
        baseStudentForNov24.setInstructorName("Teju");
        studentRegistry.register("Nov24Batch", baseStudentForNov24);

        // .... create n number of base objects.
        return studentRegistry;
    }


    public static void main(String[] args) {
        Student st = new Student();
        Student copyStudent = st.clone();

        IntelligentStudent is = new IntelligentStudent();
        IntelligentStudent copyIntelligentStudent = is.clone();

        // create custom objects.
        StudentRegistry studentRegistry = populateAndGetStudentRegistry();
        Student st1 = studentRegistry.get("Aug23Batch");
        st1.setName("Ujwal");
        st1.setAge(25);
        st1.setCity("Delhi");

        Student st2 = studentRegistry.get("Nov24Batch");
        st2.setName("Navdeep");
        st2.setAge(24);
        st2.setCity("Mumbai");

        Student st3 = studentRegistry.get("Nov24Batch");
        st3.setName("Sindhu");
        st3.setAge(23);
        st3.setCity("Bangalore");

    }
}

package org.example.backup.prototypes;

public class IntelligentStudent extends Student{

    private int iq;

    public IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent is){
        super(is);
        this.iq = is.iq;
    }

    @Override
    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}

package org.example.prototypes;

public class IntelligentStudent extends Student {

    private int iq;

    public IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent is){
        super(is);
        this.iq = is.iq;
    }

    public IntelligentStudent copy(){
        return new IntelligentStudent(this);
    }
}

package org.example.prototypes;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry{
    Map<String, Student> map = new HashMap<>();

    public void register(String key, Student baseStudentObject) {
        map.put(key, baseStudentObject);
    }

   public Student get(String key){
        return map.get(key).copy();
   }
}

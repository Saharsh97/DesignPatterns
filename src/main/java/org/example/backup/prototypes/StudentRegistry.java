package org.example.backup.prototypes;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map<String, Student> map = new HashMap<>();

    public void register(String name, Student student) {
        map.put(name, student);
    }

    public Student get(String name){
        return map.get(name).clone();
    }
}

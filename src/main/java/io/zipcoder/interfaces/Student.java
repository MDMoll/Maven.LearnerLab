package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    public Student(Long id, String name) {
        super(id, name);
    }
    
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
    
    private Double totalStudyTime;
    
    public void learn(Double numberOfHours) {
        totalStudyTime = numberOfHours;
    }
    
    ;
}

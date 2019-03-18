package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public enum ZipCodeWilmington {
    INSTANCE;
    static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();
    
    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.toArray(), numberOfHours);
    }
    
    public void hostLecture(Long instructorId, double numberOfHours) {
        Person person = instructors.getById(instructorId);
        Teacher teacher = (Teacher) person;
        hostLecture(teacher, numberOfHours);
    }
    
    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new HashMap<>();
        for (Student student : students) {
            map.put(student, student.getTotalStudyTime());
        }
        return map;
        
    }
    
}

package io.zipcoder.interfaces;

public class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();
    
    
    private Instructors() {
        String[] names = {"Leon", "Froilan", "Kris"};
        for (Integer i = 0; i < names.length; i++) {
            String name = names[i];
            Instructor instructor = new Instructor(i.longValue(), name);
            super.add(instructor);
            
        }
    }
    
    public static Instructors getInstance() {
        return INSTANCE;
    }
    
    @Override
    public Instructor[] toArray() {
        return (Instructor[]) super.personList.toArray(new Instructor[personList.size()]);
        
    }
}

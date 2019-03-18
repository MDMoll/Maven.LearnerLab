package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    FROILAN,
    LEON,
    KRIS;
    
    private final Instructor instructor;
    
    public Double getNumberOfHoursTaught() {
        return numberOfHoursTaught;
    }
    
    private Double numberOfHoursTaught;
    
    Educator() {
        this.instructor = new Instructor((long) ordinal(), name()) {
            
            @Override
            public void teach(Learner learner, double numberOfHours) {
                learner.learn(numberOfHours);
                numberOfHoursTaught = numberOfHours;
            }
        };
    }
    
    
    @Override
    public void teach(Learner learner, double numberOfHours) {
        numberOfHoursTaught = numberOfHours;
        instructor.teach(learner, numberOfHours);
    }
    
    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        numberOfHoursTaught = numberOfHours;
        instructor.lecture(learners, numberOfHours);
    }
    
}

package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    
    @Test
    public void testImplementation(){
        //Given
        Student student = new Student(1L, "Don");
        Assert.assertTrue(student instanceof Learner);
    }
    
    @Test
    public void testInheritance(){
        //Given
        Student student = new Student(1L, "Don");
        Assert.assertTrue(student instanceof Person);
    }
}

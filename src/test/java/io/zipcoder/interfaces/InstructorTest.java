package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {
    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(5L, "Kris");
        Assert.assertTrue(instructor instanceof Teacher);
    }
    
    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(5L, "Kris");
        Assert.assertTrue(instructor instanceof Person);
    }
    
}

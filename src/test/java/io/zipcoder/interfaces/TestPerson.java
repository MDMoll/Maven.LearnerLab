package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {
    
    Person person = new Person(50L, "Erica");
    
    @Test
    public void testConstructor() {
        //Given
        String expectedName = "Leon";
        Long expectedID = 10L;
        
        //When
        Person person = new Person(expectedID, expectedName);
        
        //Then
        Assert.assertEquals(expectedID, person.getId());
        Assert.assertEquals(expectedName, person.getName());
    }
    
    @Test
    public void testSetName() {
        //Given
        Person person = new Person();
        String expectedName = "John";
        //When
        person.setName(expectedName);
        //Then
        Assert.assertEquals(expectedName, person.getName());
    }
}

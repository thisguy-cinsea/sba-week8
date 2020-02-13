package com.github.perscholas;

import org.junit.Assert;
import org.junit.Test;

public class SchoolManagementSystemTest {
    @Test
    public void testRun() { // TODO
        // Given
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem();

        // when
        schoolManagementSystem.run();

        //then
        Assert.assertNotNull(schoolManagementSystem.toString());
    }
}

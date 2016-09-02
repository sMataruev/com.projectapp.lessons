package com.projectapp.lessons.___2___StandartLibraryOfJava.Strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Wilkinson on 01.09.2016.
 */
public class CalculateTest {
    @Test
    public void getRes() throws Exception {
        Calculate ob = new Calculate(5, 5);
        double c = ob.getRes();
        assertEquals(10, c, 0);
    }

}
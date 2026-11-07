package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StudentMarksCardTest {

    @Test
    public void testAGrade() {
        assertEquals("A Grade", StudentMarksCard.calculateGrade(95));
    }

    @Test
    public void testBGrade() {
        assertEquals("B Grade", StudentMarksCard.calculateGrade(85));
    }

    @Test
    public void testCGrade() {
        assertEquals("C Grade", StudentMarksCard.calculateGrade(75));
    }

    @Test
    public void testDGrade() {
        assertEquals("D Grade", StudentMarksCard.calculateGrade(60));
    }
}
package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurrenceMatcherTest {

    OccurrenceMatcher occurrenceMatcher;

    @Before
    public void setUp() throws Exception {
        occurrenceMatcher = new OccurrenceMatcher();
    }

    @After
    public void tearDown() throws Exception {
        occurrenceMatcher = null;
    }

    /**
     * Test - getOccurrencePositions()
     * Given null, the method should throw a
     * NullPointerException.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullArgumentsShouldThrowNullPointerException() {
        occurrenceMatcher.getOccurrencePositions(null,null);
    }

    @Test(expected = NullPointerException.class)
    public void givenNullStringShouldThrowNullPointerException() {
        occurrenceMatcher.getOccurrencePositions(null,"se");
    }

    @Test(expected = NullPointerException.class)
    public void givenNullSearchPatternShouldThrowNullPointerException() {
        occurrenceMatcher.getOccurrencePositions("Some string search example.", null);
    }

    /**
     * Test - getOccurrencePositions()
     * Given a empty string, method should throw a
     * Runtime Exception.
     */
    @Test(expected = RuntimeException.class)
    public void givenBlankSearchPatternShouldThrowNullPointerException() {
        occurrenceMatcher.getOccurrencePositions("String to search", "  ");
    }

    @Test(expected = RuntimeException.class)
    public void givenBlankStringShouldThrowNullPointerException() {
        occurrenceMatcher.getOccurrencePositions("  ", "se");
    }

    /**
     * Test - getOccurrencePositions()
     * Check if the method throws RunTimeException when blank string is given.
     */
    @Test(expected = RuntimeException.class)
    public void givenEmptyStringShouldThrowNullPointerExceptions() {
        occurrenceMatcher.getOccurrencePositions("", "Se");
    }

    @Test(expected = RuntimeException.class)
    public void givenEmptyPatternShouldThrowNullPointerExceptions() {
        occurrenceMatcher.getOccurrencePositions("String to search.", "");
    }

    /**
     * Test - getOccurrencePositions
     * Check if the method return an array of strings with each string containing
     * the beginning and the end of each occurrence.
     */
    @Test
    public void givenStringAndPatternShouldReturnStringArray() {
        String[] exptectedResult = {
                "4-6",
                "10-12",
                "27-29"
        };
        assertArrayEquals("givenStringAndPatternShouldReturnStringArray: Should return an array containing first and end positions of the substring where the match occurred.",
                exptectedResult, occurrenceMatcher.getOccurrencePositions("She sells seashells by the seashore", "se"));
    }

    /**
     * Test - getOccurrencePositions
     * Given a string and a pattern that is not present in the string, the
     * method should return null.
     */
    @Test
    public void givenStringAndWrongPatternShouldReturnNull() {
        assertNull("givenStringAndWrongPatternShouldReturnNull: getOccurrencePositions() should return null",
                occurrenceMatcher.getOccurrencePositions("She sells seashells by the seashore", "de"));
    }

}
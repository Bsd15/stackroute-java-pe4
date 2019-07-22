package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class OccurrenceCounterTest {

    OccurrenceCounter occurrenceCounter;

    @Before
    public void setUp() throws Exception {
        occurrenceCounter = new OccurrenceCounter();
    }

    @After
    public void tearDown() throws Exception {
        occurrenceCounter = null;
    }

    /**
     * Test - countOccurrences()
     * Given null string to count occurrences, the method should throw a
     * NullPointerException.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullStringShouldThrowNullPointerException() {
        occurrenceCounter.countOccurrences("c", null);
    }

    /**
     * Test - countOccurrences()
     * Given a null character to count occurrences, method should throw a
     * Null Pointer Exception.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullCharacterShouldThrowNullPointerException() {
        occurrenceCounter.countOccurrences(null, "example");
    }

    /**
     * Test - countOccurrences()
     * Check if the method throws NullPointerException when empty strings are given.
     */
    @Test(expected = NullPointerException.class)
    public void givenEmptyStringsShouldThrowNullPointerExceptions() {
        occurrenceCounter.countOccurrences("", "");
    }

    /**
     * Test - countOccurrences()
     * Given String and Character to match should return number of occurrences of the character
     */
    @Test
    public void givenCharAndStringShouldReturnCountOfOccurrences() {
        assertEquals("givenStringAndCharShouldReturnCountOfOccurrences: check countOccurrence(). Should return the count of number of occurrences of the given character.",
                10, occurrenceCounter.countOccurrences("a", "Java is java again java again"));
    }

    /**
     * Test - countOccurrences()
     * Same test as givenCharAndStringShouldReturnCountOfOccurrences, but check asserts
     * for wrong value.
     */
    @Test
    public void givenCharAndStringShouldReturnCountOfOccurrencesOfThatChar() {
        assertNotEquals("givenCharAndStringShouldReturnCountOfOccurrencesOfThatChar: check countOccurrences(). Should return the count of occurrences of the given character.",
                15, occurrenceCounter.countOccurrences("a", "Java is java again java again"));
    }
}
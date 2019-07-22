package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegexMatcherTest {

    RegexMatcher regexMatcher;

    @Before
    public void setUp() throws Exception {
        regexMatcher = new RegexMatcher();
    }

    @After
    public void tearDown() throws Exception {
        regexMatcher = null;
    }

    /**
     * Test - findPattern()
     * Given null, the method should throw a
     * NullPointerException.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullStringShouldThrowNullPointerException() {
        regexMatcher.findPattern(null);
    }

    /**
     * Test - findPattern()
     * Given a empty string, method should throw a
     * Runtime Exception.
     */
    @Test(expected = RuntimeException.class)
    public void givenNullCharacterShouldThrowNullPointerException() {
        regexMatcher.findPattern("  ");
    }

    /**
     * Test - findPattern()
     * Check if the method throws RunTimeException when blank string is given.
     */
    @Test(expected = RuntimeException.class)
    public void givenEmptyStringsShouldThrowNullPointerExceptions() {
        regexMatcher.findPattern("");
    }

    /**
     * Test - findPattern()
     * When a string containing "harry" is given, the method should return true.
     */
    @Test
    public void givenInputShouldReturnTrue() {
        assertTrue("givenInputShouldReturnTrue: check findPattern(). Should return true.",
                regexMatcher.findPattern("This is harry"));
    }

    /**
     * Test - findPattern()
     * When a string without containing "harry" is given, method should return false.
     */
    @Test
    public void givenStringWithoutHarryShouldReturnFalse() {
        assertFalse("givenStringWithoutHarryShouldReturnFalse: check findPattern(). Should return false.",
                regexMatcher.findPattern("This is Henry?"));
    }

    /**
     * Test - findPattern()
     * Check if the method works when string contains both upper and lower case letters.
     */
    @Test
    public void givenStringWithHarryInUpperCaseShouldReturnTrue() {
        assertTrue("givenStringWithHarryInUpperCaseShouldReturnTrue: check findPattern(). Should return true even for uppercase string.",
                regexMatcher.findPattern("This is Harry."));
    }
}
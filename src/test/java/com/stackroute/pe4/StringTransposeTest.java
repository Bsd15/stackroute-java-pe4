package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {

    StringTranspose stringTranspose;

    @Before
    public void setUp() throws Exception {
        stringTranspose = new StringTranspose();
    }

    @After
    public void tearDown() throws Exception {
        stringTranspose = null;
    }

    /**
     * Test - transposeWordsInString()
     * Given empty string as input, check if the method return an error message or not.
     */
    @Test
    public void givenEmptyStringShouldReturnErrorMessage() {
        String expectedMessage = "Please enter a valid string. Null or empty string given.";
        assertEquals("givenNullShouldReturnErrorMessage: check transposeWordsInStrings()",
                expectedMessage, stringTranspose.transposeWordsInString(""));
    }

    /**
     * Test - transposeWordsInString()
     * Given blank string as input, check if the method return an error message or not.
     */
    @Test
    public void givenBlankStringShouldReturnErrorMessage() {
        String expectedMessage = "Please enter a valid string. Null or empty string given.";
        assertEquals("givenNullShouldReturnErrorMessage: check transposeWordsInStrings()",
                expectedMessage, stringTranspose.transposeWordsInString("  "));
    }

    /**
     * Test - transposeWordsInString()
     * Should return transpose of the given string.
     */
    @Test
    public void givenStringShouldReturnTranspose() {
        String expectedResult = "a kciuq nworb xof spmuj revo eht yzal god";
        assertEquals("givenStringShouldReturnTranspose: check transposeWordsInString(). Should return reverse of the string",
                expectedResult, stringTranspose.transposeWordsInString("a quick brown fox jumps over the lazy dog"));
    }
}
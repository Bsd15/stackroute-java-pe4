package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParagraphWordsSorterTest {
    ParagraphWordsSorter paragraphWordsSorter;
    @Before
    public void setUp() throws Exception {
        paragraphWordsSorter = new ParagraphWordsSorter();
    }

    @After
    public void tearDown() throws Exception {
        paragraphWordsSorter = null;
    }

    /**
     * Test - sortWordsInParagraph()
     * Given null string to count occurrences, the method should throw a
     * NullPointerException.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullStringShouldThrowNullPointerException() {
        paragraphWordsSorter.sortWordsInParagraph(null);
    }

    /**
     * Test - sortWordsInParagraph()
     * Given a Empty string, method should throw a Null Pointer Exception.
     */
    @Test(expected = NullPointerException.class)
    public void givenEmptyStringShouldThrowNullPointerException() {
        paragraphWordsSorter.sortWordsInParagraph("");
    }

    /**
     * Test - sortWordsInParagraph()
     * Check if the method throws NullPointerException when blank strings are given.
     */
    @Test(expected = NullPointerException.class)
    public void givenEmptyStringsShouldThrowNullPointerExceptions() {
        paragraphWordsSorter.sortWordsInParagraph("   ");
    }

    /**
     * Test - sortWordsInParagraph()
     * Given a string input, the method should return an array of strings sorted
     * alphabetically.
     */
    @Test
    public void givenInputShouldReturnArrayOfSortedWords() {
        String[] expectedOutput = {
                "a",
                "Hello",
                "is",
                "test.",
                "This",
                "world."
        };
        assertArrayEquals("givenInputShouldReturnArrayOfSortedWords: check sortWordsInParagraph(). Should return an array of sorted words.",
                expectedOutput, paragraphWordsSorter.sortWordsInParagraph("Hello world. This is a test."));
    }

}
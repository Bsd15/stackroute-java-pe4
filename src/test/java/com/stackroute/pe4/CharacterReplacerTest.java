package com.stackroute.pe4;

import org.junit.*;

import static org.junit.Assert.*;

public class CharacterReplacerTest {

    CharacterReplacer characterReplacer;

    @Before
    public void setUp() throws Exception {
        characterReplacer = new CharacterReplacer();
    }

    @After
    public void tearDown() throws Exception {
        characterReplacer = null;
    }

    /**
     * Test - replaceCharacter()
     * Given null as input, check if the method throws a NullPointerException or not.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowNullPointerException() {
        characterReplacer.replaceCharacters(null);
    }

    /**
     * Test - replaceCharacter()
     * Given empty string as input, check if the method return an error message or not.
     */
    @Test
    public void givenEmptyStringShouldReturnErrorMessage() {
        String expectedMessage = "Please enter a valid string. Null or empty string given.";
        assertEquals("givenNullShouldReturnErrorMessage: check replaceCharacters()",
                expectedMessage, characterReplacer.replaceCharacters(""));
    }

    /**
     * Test - replaceCharacter()
     * Given blank string as input, check if the method return an error message or not.
     */
    @Test
    public void givenBlankStringShouldReturnErrorMessage() {
        String expectedMessage = "Please enter a valid string. Null or empty string given.";
        assertEquals("givenNullShouldReturnErrorMessage: check replaceCharacters()",
                expectedMessage, characterReplacer.replaceCharacters("  "));
    }


    /**
     * Test - replaceCharacters()
     * Given a String without any d or i characters in it, the method should return
     * the same string without any changes.
     */
    @Test
    public void givenStringWithoutDAndIShouldReturnSameString() {
        String expectedMessage = "Hello Java.";
        assertEquals("givenStringWithoutDAndIShouldReturnSameString: check replaceCharacters()",
                expectedMessage, characterReplacer.replaceCharacters(expectedMessage));
    }

    /**
     * Test - replaceCharacters()
     * Given a string with d and i characters, the method should return valid output.
     */
    @Test
    public void givenStringWitShouldReturnStringWithReplacedDAndICharacters() {
        String expectedMessage = "fatly fry";
        assertEquals("givenStringWithoutDAndIShouldReturnSameString: check replaceCharacters()",
                expectedMessage, characterReplacer.replaceCharacters("daily dry"));
    }

}
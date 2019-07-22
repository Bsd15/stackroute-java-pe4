package com.stackroute.pe4;

/**
 * Java - Practice Exercise - 4
 * Question - 1
 * Write a java program to count the total number of occurrences of a given character in a string
 * without using any loop?
 */
public class OccurrenceCounter {
    /**
     * Method takes in two strings. The first string is converted into character type and it's occurrences are
     * counted in the second string.
     * @param characterToCountAsString Character that is to be counted. String takes a character as input and converts it into a character type.
     * @param stringToCount String in which is checked for the occurrences of the character.
     * @return Count of occurrences of the given character as long.
     */
    public long countOccurrences(String characterToCountAsString, String stringToCount) {
        if (characterToCountAsString.isEmpty() || stringToCount.isEmpty() || characterToCountAsString.isBlank() || stringToCount.isBlank() || characterToCountAsString.equals(null) || stringToCount.equals(null)) {
            throw new NullPointerException();
        }
        Character characterToCount = characterToCountAsString.toCharArray()[0];
        return stringToCount.chars().filter(characterInString -> characterInString == characterToCount)
                .count();
    }
}

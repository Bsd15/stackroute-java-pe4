package com.stackroute.pe4;

/**
 * Java - Practice Exercise - 4
 * Question - 2
 * Write a program to replace all d with f and all l with t in the given ​ String
 */
public class CharacterReplacer {

    /**
     * Method takes in a string and return a string by replacing all occurrences of
     * "d" with "f" and "i" with "t".
     * @param inputString String in which characters are to be replaced.
     * @return String with replaced characters.
     */
    public String replaceCharacters(String inputString) {
        if (inputString.isEmpty() || inputString.isBlank()) {
            return "Please enter a valid string. Null or empty string given.";
        }
        String replaceCharactersString = inputString.replaceAll("d", "f");
        replaceCharactersString = replaceCharactersString.replaceAll("i", "t");
        return replaceCharactersString;
    }
}

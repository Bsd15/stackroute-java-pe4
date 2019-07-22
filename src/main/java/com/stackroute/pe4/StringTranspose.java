package com.stackroute.pe4;

/**
 * Java - Practice Exercise - 4
 * Question - 4
 * Write a program to transpose the given ​ string​ .
 */
public class StringTranspose {
    /**
     * @param input String for which the transpose has to be done.
     * @return Transpose of the string.
     */
    public String transposeWordsInString(String input) {
        if (input.isEmpty() || input.isBlank()) {
            return "Please enter a valid string. Null or empty string given.";
        }
        String[] wordsArray = input.split("\\s");
        StringBuilder transposeString = new StringBuilder();
        for (String word : wordsArray) {
            transposeString.append(
                    new StringBuilder(word).reverse() + " "
            );
        }
        return transposeString.toString().trim();
    }
}

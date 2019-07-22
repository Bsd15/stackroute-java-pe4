package com.stackroute.pe4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Java - Practice Exercise - 4
 * Question - 3
 * Write a program that ​ sets​ up a ​ String​ variable containing a paragraph of text of your choice.
 * a. Extract the words from the text and sort them into alphabetical order.
 * b. Display the sorted list of words.
 */
public class ParagraphWordsSorter {
    /**
     * Method takes in a string or a paragraph and splits the string into an array
     * and sorts them alphabetically (case insensitive) and returns it.
     * @param paragraphToSort String, of which words are to be sorted and returned.
     * @return String array sorted alphabetically
     */
    public String[] sortWordsInParagraph(String paragraphToSort) {
        if (paragraphToSort.isEmpty() || paragraphToSort.isBlank()) {
            throw new NullPointerException();
        }
        List<String> wordsList = Arrays.asList(paragraphToSort.split(" "));
        Collections.sort(wordsList, String.CASE_INSENSITIVE_ORDER);
        return wordsList.toArray(new String[wordsList.size()]);
    }
}

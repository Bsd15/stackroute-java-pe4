package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java - Practice Exercise - 4
 * Question - 5
 * Write a program with the implementation of ​ Regular Expression​ to find the presence of the name
 * Harry in a ​ string​ .
 */
public class RegexMatcher {
    /**
     * @param stringToMatch String to check if "Harry" exists in it.
     * @return True if "harry" exists in string, else false.
     */
    public boolean findPattern(String stringToMatch) {
        if (stringToMatch.isBlank() || stringToMatch.isEmpty()) {
            throw new RuntimeException("Empty or Blank string given");
        }
        Pattern pattern = Pattern.compile("(\\s?)(?i)harry\\1");
        Matcher matcher = pattern.matcher(stringToMatch);
        return matcher.find();
    }
}

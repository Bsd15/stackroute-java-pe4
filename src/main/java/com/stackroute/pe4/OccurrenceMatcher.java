package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java - Practice Exercise - 4
 * Question - 6
 * Write a program to find out the multiple occurrences of the given word in a ​ string​ using Matcher
 * methods.
 */
public class OccurrenceMatcher {

    public String[] getOccurrencePositions(String stringToMatch, String patternToSearch) {
        if (stringToMatch.isEmpty() || stringToMatch.isBlank() || patternToSearch.isEmpty() || patternToSearch.isBlank()) {
            throw new RuntimeException();
        }
        Pattern pattern = Pattern.compile(patternToSearch);
        Matcher matcher = pattern.matcher(stringToMatch);
        if (matcher.find()) {
            List<String> occurrencesString = new ArrayList<>();
            occurrencesString.add(matcher.start() + "-" + matcher.end());
            while (matcher.find()) {
                occurrencesString.add(matcher.start() + "-" + matcher.end());
            }
            return occurrencesString.toArray(new String[occurrencesString.size()]);
        }
        return null;
    }
}

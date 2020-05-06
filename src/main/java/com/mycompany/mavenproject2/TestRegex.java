package com.mycompany.mavenproject2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex
{
    public static void main(String[] args)
    {
        String input = "skad  kesyl judiw   sketye76";

        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(input);

        boolean found = false;
        while (matcher.find()) {
            System.out.println("found '" + matcher.group(0) + "' from " +
                               matcher.start() + " to " + matcher.end());
            found = true;
        }
        if (!found) {
            System.out.println("no matches found!");
        }
    }
}


package com.mycompany.mavenproject2;

import java.util.*;

public class Histogram {

    public static void main(String[] args) {

        String s = "this is just a test";

        Map<Character, Integer> map = new TreeMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!map.containsKey(c)) {
                map.put(c, 1); // first time
            } else {
                map.put(c, map.get(c) + 1); // update adding one
            }
        }

        System.out.println(map);
    }
}

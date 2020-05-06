/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author roger
 */
public class TestLivro {

    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<String, Integer>();

        SimpleReader file = new SimpleReader("C:\\Users\\roger\\Documents\\NetBeansProjects\\mavenproject2\\src\\main\\java\\com\\mycompany\\mavenproject2\\pg50133.txt");

        String line = file.readLine();

        while (line != null) {
            String[] words = line.split("\\W");

            for (String word : words) {

                if (!map.containsKey(word)) { // first time
                    map.put(word, 1);
                } else {
                    map.put(word, map.get(word) + 1); // update count
                }
            }
            line = file.readLine();
        }
        file.close();
        for (String w : map.keySet()) {
            System.out.println(w + ": " + map.get(w));
        }
    }

}

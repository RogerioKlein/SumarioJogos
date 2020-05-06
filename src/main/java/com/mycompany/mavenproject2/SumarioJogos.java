/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author roger
 */
public class SumarioJogos {

    private static class Info {

        public int reviwes;
        public int scorePhrases;
        public int scores;
        
    }

    public static void main(String[] args) {

        Map<String, Info> map = new TreeMap<String, Info>();

        SimpleReader file = new SimpleReader("C:\\Users\\roger\\Documents\\NetBeansProjects\\mavenproject2\\src\\main\\java\\com\\mycompany\\mavenproject2\\game-reviews.csv");

        String line = file.readLine();
        line = file.readLine();

        while (line != null) {
            String[] col = line.split(";");
            String scorePhrase = col[2];
            Double score = Double.parseDouble(col[3]);
            String year = col[6];

            if (!map.containsKey(year)) { // contagem
                map.put(year, 1);
            } else {
                map.put(year, map.get(year) + 1);
            }

            line = file.readLine();
        }
        file.close();

        for (String w : map.keySet()) {
            System.out.println(w + ": " + map.get(w));
        }
    }
}

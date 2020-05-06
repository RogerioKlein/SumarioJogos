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

    public static void main(String[] args) {

        Map<String, Integer> mapCont = new TreeMap<String, Integer>();
        Map<String, Integer> mapScorePhrase = new TreeMap<String, Integer>();

        SimpleReader file = new SimpleReader("C:\\Users\\roger\\Documents\\NetBeansProjects\\mavenproject2\\src\\main\\java\\com\\mycompany\\mavenproject2\\game-reviews.csv");

        String line = file.readLine();
        line = file.readLine();

        while (line != null) {
            String[] col = line.split(";");
            String year = col[6];
            
            
            if (!mapCont.containsKey(year)) { // contagem
                mapCont.put(year, 1);
            } else {
                mapCont.put(year, mapCont.get(year) + 1);
            }
            
            

            line = file.readLine();
        }
        file.close();
        
        
        for (String w : mapCont.keySet()) {
            System.out.println(w + ": " + mapCont.get(w));
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author roger
 */
import java.util.*;

public class TestSetMap {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>(); // TreeMap

        set.add(37);
        set.add(68);
        set.add(14);
        System.out.println("set");
        for (int e : set) {
            System.out.println(e);
        }

        Map<Integer, String> map = new TreeMap<Integer, String>(); // HashMap

        map.put(37, "yesterday");
        map.put(68, "today");
        map.put(14, "tomorrow");
        System.out.println("\nmap");
        for (int k : map.keySet()) {
            System.out.println(k + ": " + map.get(k));

        }
    }
}

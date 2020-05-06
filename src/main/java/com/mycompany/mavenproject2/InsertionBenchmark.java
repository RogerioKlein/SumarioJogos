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

public class InsertionBenchmark {

    public static void main(String[] args) {
        int i, n = 1000000;
        long start;

        List<Integer> linked = new LinkedList<Integer>();
        List<Integer> array = new ArrayList<Integer>();

        System.out.println("Time for " + n + " insertions (in seconds)");

        start = System.currentTimeMillis();
        for (i = 0; i < n; i++) {
            linked.add(0, i);
        }
        System.out.println("  LinkedList: " + (System.currentTimeMillis() - start) / 1000.0);

        start = System.currentTimeMillis();
        for (i = 0; i < n; i++) {
            array.add(0, i);
        }
        System.out.println("  ArrayList:  " + (System.currentTimeMillis() - start) / 1000.0);
    }
}

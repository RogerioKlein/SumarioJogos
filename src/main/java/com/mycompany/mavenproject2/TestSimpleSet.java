/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rhklein
 */
package com.mycompany.mavenproject2;

public class TestSimpleSet {

    public static void main(String[] args) {

        SimpleSet s1 = new SimpleSet();
        s1.add("java");
        s1.add("python");
        s1.add("c#");
        s1.add("java");

        SimpleSet s2 = new SimpleSet();
        s2.add("python");
        s2.add("java");
        s2.add("java");
        s2.add("c#");

        System.out.println(s1.equals(s2));
    }
}

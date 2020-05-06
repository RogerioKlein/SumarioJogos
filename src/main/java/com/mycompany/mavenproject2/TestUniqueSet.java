
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

public class TestUniqueSet {

    public static void main(String[] args) {

        UniqueSet s1 = new UniqueSet();
        s1.add("java");
        s1.add("python");
        s1.add("c#");
        s1.add("java");

        UniqueSet s2 = new UniqueSet();
        s2.add("c#");
        s2.add("java");
        s2.add("ruby");
        s2.add("python");

        UniqueSet s3 = new UniqueSet();
        s3.add("java");
        s3.add("VBA");
        s3.add("ruby");

        UniqueSet s4 = new UniqueSet();
        s4.add("java");
        s4.add("C++");
        s4.add("python");

        UniqueSet r1 = s1.union(s3);
        System.out.println(r1);
        if (!r1.toString().equals("[VBA, c#, java, python]")) {
            System.out.println("FAIL 1");
        }

        UniqueSet r2 = s3.intersection(s4);
        System.out.println(r2);
        if (!r2.toString().equals("")) {
            System.out.println("FAIL 2");
        }

        UniqueSet r3 = s3.difference(s4);
        System.out.println(r3);
        if (!r3.toString().equals("java,VBA")) {
            System.out.println("FAIL 3");
        }
        //UniqueSet s2 = s1.copy();
        //UniqueSet s3 = new UniqueSet(s1);
        //System.out.println(s1.equals(s2));
        //System.out.println(s1.equals(s3));
    }
}

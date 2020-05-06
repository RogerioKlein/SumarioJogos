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
public class TestSimpleQueue {
    public static void main(String[] args) {
        SimpleQueue sq = new SimpleQueue();
        sq.add(1);
        sq.add(2);
        sq.add(3);
        sq.add(4);
        sq.add(5);
        System.out.println(sq);

        try {
            System.out.println("rem " + sq.remove());
            System.out.println("pri " + sq.first());
            System.out.println("tam " + sq.size());
            System.out.println("rem " + sq.remove());
            System.out.println("rem " + sq.remove());
            System.out.println("rem " + sq.remove());
            System.out.println("rem " + sq.remove());
            System.out.println("rem " + sq.remove());
        } catch (Exception e) {
            System.err.println("error: " + e);
            //e.printStackTrace();
        }
        
    }
    
}

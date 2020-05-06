/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author rhklein
 */
public class TestSimpleStack {

    public static void main(String[] args) {

        SimpleStack ss = new SimpleStack();
        ss.push(1);
        ss.push(2);
        ss.push(3);
        System.out.println(ss);

        try {
            System.out.println(ss.pop());
            System.out.println(ss.peek());
            System.out.println(ss.size());
            System.out.println(ss.pop());
            System.out.println(ss.pop());
            System.out.println(ss.pop());
        } catch (Exception e) {
            System.err.println("error: " + e);
            //e.printStackTrace();
        }

    }

}

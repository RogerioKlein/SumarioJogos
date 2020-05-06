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
public class TestSimpleList {

    public static void main(String[] args) {

        SimpleList sl = new SimpleList();

        sl.insertFirst(1);

        System.out.println("" + sl.last());
        if (1 != 1) {
            sl.insertFirst(1);
            sl.insertFirst(2);
            sl.insertFirst(3);
            sl.insertFirst(4);
            sl.insertFirst(5);

            System.out.println(sl.toString());

            System.out.println(sl.find(3));

            sl.insertAfter1(sl.find(4), 7); // funciona normal
            System.out.println(sl.toString());
        }

    }
}

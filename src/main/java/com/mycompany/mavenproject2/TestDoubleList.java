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
public class TestDoubleList {

    public static void main(String[] args) {

        DoubleList dl = new DoubleList();

        dl.insertFirst(1);
        dl.insertFirst(2);
        dl.insertFirst(3);
        dl.insertFirst(4);
        dl.insertFirst(5);

        System.out.println(dl);
        System.out.println("" + dl.first());
        System.out.println("" + dl.last());
        System.out.println("" + dl.size());

        dl.insertLast(10);

        System.out.println(dl);
        System.out.println("" + dl.first());
        System.out.println("" + dl.last());
        System.out.println("" + dl.size());

        dl.insertAfter(dl.find(3), 23);
        System.out.println("depois" + dl);
        dl.insertBefore(dl.find(3), 33);
        System.out.println("antes" + dl);

    }

}

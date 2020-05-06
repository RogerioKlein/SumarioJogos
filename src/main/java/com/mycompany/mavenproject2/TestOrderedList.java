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
public class TestOrderedList {

    public static void main(String[] args) {
        
        OrderedList ol = new OrderedList();
        ol.insertInOrder(5);
        System.out.println(ol);
        ol.insertInOrder(10);
        System.out.println(ol);
        ol.insertInOrder(3);
        System.out.println(ol);
        ol.insertInOrder(6);
        System.out.println(ol);
        ol.insertInOrder(1);
        System.out.println(ol);
        ol.insertInOrder(7);
        System.out.println(ol);

        
    }

}

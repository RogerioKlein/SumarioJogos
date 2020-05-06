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
public class TestDoubleNode {

    public static void main(String[] args) {

        DoubleNode a = new DoubleNode(null, 1, null);
        DoubleNode b = new DoubleNode(null, 2, null);
        DoubleNode c = new DoubleNode(null, 3, null);

        a.next = b;
        b.previous = a;

        b.next = c;
        c.previous = b;

        DoubleNode n = c;
        while (n != null) {
            System.out.println(n);
            n = n.previous;
        }
        System.out.println();
    }

}

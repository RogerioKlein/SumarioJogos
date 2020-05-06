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
public class TestNode {

    public static void main(String[] args) {

        Node a = new Node(1, null);
        Node b = new Node(2, null);
        Node c = new Node(3, null);
        Node d = new Node(4, null);

        a.next = b;
        b.next = c;
        c.next = d;

        Node n = a;
        while (n != null) {
            System.out.print(n);
            n = n.next;
        }
        System.out.println();
    }

}

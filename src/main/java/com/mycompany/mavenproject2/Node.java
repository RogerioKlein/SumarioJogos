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
public class Node {

    public int element;
    public Node next;

    public Node(int e, Node n) {
        this.element = e;
        this.next = n;
    }

    @Override
    public String toString() {
        if (this.next == null) {
            return "[" + this.element + "]";
        } else {
            return "[" + this.element + "] -> ";
        }
    }

}

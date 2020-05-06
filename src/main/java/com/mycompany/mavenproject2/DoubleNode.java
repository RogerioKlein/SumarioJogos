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
public class DoubleNode {

    public DoubleNode previous;
    public int element;
    public DoubleNode next;

    public DoubleNode(DoubleNode p, int e, DoubleNode n) {
        this.previous = p;
        this.element = e;
        this.next = n;
    }

    @Override
    public String toString() {
        String s = "";
        if (this.previous != null) {
            s += " <-";
        }
        s += "[" + this.element + "]";
        if (this.next != null) {
            s += "-> ";
        }
        return s;
    }
}

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
public class SimpleList {

    private Node header;
    private int size;

    public SimpleList() {
        this.header = null;
        this.size = 0;
    }

    public Node first() {
        return this.header;
    }

    public int size() {
        return this.size();
    }

    public void insertFirst(int e) {

        if (this.header == null) { //empty list
            this.header = new Node(e, null);
        } else { //not empty list
            this.header = new Node(e, this.header);
        }
        this.size++;
    }

    public Node find(int e) {
        Node n = first();
        Node f = null;
        while (n != null) {
            if (e == n.element) {
                f = n;
            }
            n = n.next;
        }
        System.out.println("" + f);
        return f;
    }

    public Node last() {
        Node n = first();
        if (n == null) {
            return null;
        }
        while (n.next != null) {
            n = n.next;
        }
        return n;
    }

    public void insertAfter1(Node ref, int e) { // Depois do n na Fila
        ref.next = new Node(e, ref.next);
    }

    @Override
    public String toString() {
        Node n = first();
        String s = "";
        while (n != null) {
            s += n.toString();
            n = n.next;
        }
        return s;
    }

}

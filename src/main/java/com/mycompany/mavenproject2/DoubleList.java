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
public class DoubleList {

    private DoubleNode header;
    private DoubleNode trailer;
    private int size;

    public DoubleList() {
        this.header = null;
        this.trailer = null;
        this.size = 0;
    }

    public DoubleNode first() {
        return this.header;
    }

    public DoubleNode last() {
        return this.trailer;
    }

    public int size() {
        return this.size;
    }

    public DoubleNode find(int e) {
        DoubleNode n = first();
        DoubleNode f = null;
        while (n != null) {
            if (e == n.element) {
                f = n;
            }
            n = n.next;
        }
        System.out.println("" + f);
        return f;
    }

    public void insertAfter(DoubleNode ref, int e) {
        DoubleNode n = new DoubleNode(null, e, null);
        if (ref.next == null) {
            ref.next = n;
            n.previous = ref;
            this.trailer = n;
        } else {
            DoubleNode old = ref.next;
            ref.next = n;
            n.next = old;
            old.previous = n;
            n.previous = ref;
        }
        this.size++;
    }

    public void insertBefore(DoubleNode ref, int e) {
        DoubleNode n = new DoubleNode(null, e, null);
        if (ref.previous == null) {
            ref.previous = n;
            n.next = ref;
            this.header = n;
        } else {
            DoubleNode old = ref.previous;
            ref.previous = n;
            n.previous = old;
            old.next = n;
            n.next = ref;
        }
        this.size++;
    }

    public void insertFirst(int e) {
        if (this.header == null) {
            DoubleNode n = new DoubleNode(null, e, null);
            this.header = this.trailer = n;
        } else {
            DoubleNode n = new DoubleNode(null, e, null);
            DoubleNode old = this.header;
            this.header = n;
            n.next = old;
            old.previous = n;
        }
        this.size++;
    }

    public void insertLast(int e) {
        if (this.trailer == null) {
            DoubleNode n = new DoubleNode(null, e, null);
            this.header = this.trailer = n;
        } else {
            DoubleNode n = new DoubleNode(null, e, null);
            DoubleNode old = this.trailer;
            this.trailer = n;
            n.previous = old;
            old.next = n;
        }
        this.size++;
    }

    @Override
    public String toString() {
        DoubleNode n = first();
        String s = "";
        while (n != null) {
            s += n.toString();
            n = n.next;
        }
        return s;
    }

}

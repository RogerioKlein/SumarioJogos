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
public class OrderedList extends DoubleList {

    public void insertInOrder(int e) {
        DoubleNode dn = first();

        if (dn == null || e <= dn.element) {
            insertFirst(e);
        } else if (e >= last().element) {
            insertLast(e);
        } else {
            while (e < dn.element) {
                dn = dn.next;
            }
            insertBefore(dn, e);
        }

    }

    @Override
    public String toString() {
        return toString();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.ArrayList;

/**
 *
 * @author roger
 */
public class Dictionary {

    protected static class Item {

        public int key;
        public String value;

        public Item(int k, String v) {
            this.key = k;
            this.value = v;
        }

        public String toString() {
            return "[" + this.key + ", " + this.value + "]";
        }
    }

    protected ArrayList<Item> array;

    public Dictionary() {
        this.array = new ArrayList<Item>();
    }

    public String toString() {
        return this.array.toString();
    }

    public Item search(int k) {
        for (Item i : this.array) {
            if (i.key == k) {
                return i;
            }
        }
        return null;
    }
    //public abstract Item search(int k);

    public void put(int k, String v) {
        Item i = search(k);
        if (i == null) {
            this.array.add(new Item(k, v));
        } else {
            i.value = v;
        }
    }

    public void remove(int k) {
        this.array.remove(search(k));
    }

    public String get(int k) {
        Item i = search(k);
        if (i == null) {
            return null;
        } else {
            return i.value;
        }
    }

    public boolean containsKey(int k) {
        Item i = search(k);
        return i != null;
    }

}

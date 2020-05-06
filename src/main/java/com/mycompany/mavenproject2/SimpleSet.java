
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.*;

public class SimpleSet {

    protected ArrayList<String> array;

    public SimpleSet() {
        this.array = new ArrayList<String>();
    }

    public boolean equals(SimpleSet ss) {
        return this.toString().equals(
                ss.toString());
    }

    public String toString() {
        Collections.sort(this.array);
        return this.array.toString();
    }

    public void add(String s) {
        this.array.add(s);
    }

    public boolean contains(String s) {
        return this.array.contains(s);
    }

    public void remove(String s) {
        this.array.remove(s);
    }

    public int size() {
        return this.array.size();
    }

    void addAll(SimpleSet s2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

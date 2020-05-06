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
public class SimpleQueue {
  
    protected ArrayList<Integer> array;

    public SimpleQueue() {
        this.array = new ArrayList<Integer>();
    }

    public void add(int i) {
        this.array.add(i);
    }

    public int remove() throws Exception {
        if (size() != 0) {
            return this.array.remove(0);
        } else {
            throw new Exception("empty queue");
        }
    }

    public int first() throws Exception {
        if (size() != 0) {
            return this.array.get(0);
        } else {
            throw new Exception("empty queue");
        }
    }

    public int size() {
        return this.array.size();
    }

    public String toString() {
        return this.array.toString();
    }
}

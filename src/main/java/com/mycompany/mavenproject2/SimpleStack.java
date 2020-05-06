/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.ArrayList;

/**
 *
 * @author rhklein
 */
public class SimpleStack {

    protected ArrayList<Integer> array;

    public SimpleStack() {
        this.array = new ArrayList<Integer>();
    }

    public void push(int i) {
        this.array.add(i);
    }

    public int pop() throws Exception {
        if (size() != 0) {
            return this.array.remove(size() - 1);
        } else {
            throw new Exception("empty stack");
        }
    }

    public int peek() {
        return this.array.get(size() - 1);
    }

    public int size() {
        return this.array.size();
    }

    public String toString() {
        return this.array.toString();
    }
}

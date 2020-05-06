/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rhklein
 */
package com.mycompany.mavenproject2;

public class UniqueSet extends SimpleSet {

    //standard constructor
    public UniqueSet() {
    }

    //copy constructor
    public UniqueSet(UniqueSet us) {
        this.addAll(us);
    }

    //copy method
    public UniqueSet copy() {
        UniqueSet us = new UniqueSet();
        us.addAll(this);
        return us;
    }

    public UniqueSet union(UniqueSet us) {
        UniqueSet n = us.copy();
        n.addAll(this);
        return n;
    }

    public void add(String s) {
        if (!this.array.contains(s)) {
            this.array.add(s);
        }
    }

    public void addAll(UniqueSet us) {
        for (String s : us.array) {
            add(s);
        }
    }

    public void removeAll(UniqueSet us) {
        for (String s : array) {
            remove(s);
        }
    }

    public UniqueSet difference(UniqueSet us) {
        UniqueSet u = us.copy();
        u.removeAll(this);
        return u;
    }

    public UniqueSet intersection(UniqueSet us) {
        UniqueSet u = us.copy();
        u.removeAll(this.difference(us));
        return u;
    }

}

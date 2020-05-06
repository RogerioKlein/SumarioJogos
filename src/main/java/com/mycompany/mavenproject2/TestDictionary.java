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
public class TestDictionary {

    public static void main(String[] args) {
        Dictionary d;
        d = new Dictionary() {
            @Override
            public Dictionary.Item search(int k) {
                for (Item i : this.array) {
                    if (i.key == k) {
                        return i;
                    }
                }
                return null;
            }
        };

        d.put(1, "um");
        d.put(2, "dois");
        d.put(3, "tres");
        d.put(4, "cuatro");

        System.out.println(d);

        System.out.println("Contains 1? : " + d.containsKey(1));
        System.out.println("Contains 5? : " + d.containsKey(5));

        System.out.println("Get 3: " + d.get(3));

        System.out.println("Get 5: " + d.get(5));

        System.out.println("Search 1: " + d.search(1));
        System.out.println("Search 6: " + d.search(6));

        d.put(4, "quatro");

        System.out.println(d);
        d.remove(3);
        System.out.println(d);
        
        System.out.println("Search 3: " + d.search(3));
        System.out.println("Get 3: " + d.get(3));
    }
}

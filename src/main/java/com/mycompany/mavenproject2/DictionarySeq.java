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
public class DictionarySeq extends Dictionary {

    @Override
    public Item search(int k) {
        for (Item i : this.array) {
            if (i.key == k) {
                return i;
            }
        }
        return null;
    }

}

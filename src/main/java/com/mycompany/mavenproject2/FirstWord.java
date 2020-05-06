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
public class FirstWord {

    public Dictionary firstWord(String[] matrix) {
        Dictionary result = new Dictionary();
        for (String value : matrix) {
            if (!result.containsKey(value.length())) {
                int key = value.length();
                result.put(key, value);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FirstWord fw = new FirstWord();
        String[] test = {"eu", "bola", "tu", "casa", "dado", "teste"};

        System.out.println(fw.firstWord(test));
    }
}

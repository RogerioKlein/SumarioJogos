/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.Random;

/**
 *
 * @author roger
 */
public class RandomNumber {

    public static void main(String[] args) {
        int seed = 2;
        int max = 20;
        int min = 10;
        
        Random rng = new Random(seed);
        for (int i = 0; i < 15; i++) {
            int r = rng.nextInt(max - min + 1) + min;
            System.out.print(r + " ");
        }
        System.out.println();
    }
}

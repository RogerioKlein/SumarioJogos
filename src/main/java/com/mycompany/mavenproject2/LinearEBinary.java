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
public class LinearEBinary {

    public static int comp;

    public static boolean sequential(int[] v, int a) {
        for (int i : v) {
            comp++;
            if (i == a) {
                return true;
            }
        }
        return false;
    }

    public static boolean binary(int[] v, int a) {
        int low = 0;
        int high = v.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            comp++;
            if (a == v[mid]) {
                return true;
            }
            comp++;
            if (a < v[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        for (int n = 10; n <= 200; n++) {

            int[] array = new int[n];
            int trials = 1000;
            for (int i = 0; i < 10; i++) {
                array[i] = i;
            }

            //System.out.println("exist? " + binary(array, 44));
            Random rng = new Random();
            double sum = 0.0;
            for (int i = 0; i < trials; i++) {
                comp = 0;
                sequential(array, rng.nextInt(n));
                sum += comp;
            }
            System.out.println(n + ";" + (sum / trials));

        }
    }
}

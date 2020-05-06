/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.nio.file.Files;

/**
 *
 * @author rhklein
 */
public class StringCheck {

    public static void main(String[] args) {
        String s = "(()";
        SimpleStack ss = new SimpleStack();

        try {
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    ss.push(c);
                }
                if (c == ')') {
                    ss.pop();
                }
            }
            if (ss.size() != 0) {
                System.out.println("bad string");
            }

        } catch (Exception e) {
            System.out.println("bad string");
        }

    }
}

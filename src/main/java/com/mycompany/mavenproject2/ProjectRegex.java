/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author roger
 */
public class ProjectRegex {

    public static void main(String[] args) {

        int c = 0;
        SimpleSet ss = new SimpleSet();

        SimpleReader f = new SimpleReader("C:\\Users\\roger\\Desktop\\log-large.txt");
        int i = 1;
        String s = f.readLine();
        while (s != null) { // lendo linha do arquivo
            //System.out.println("" + s);
            Pattern pattern = Pattern.compile("([\\w._]+)@(\\w+\\.)+\\w+|\\buser \"?(\\w+)\"?"); // regex
            Matcher matcher = pattern.matcher("" + s);

            boolean found = false;
            while (matcher.find()) {
                //System.out.println("found '" + matcher.group(0) + "' from " + matcher.start() + " to " + matcher.end());
                String t = "";
                if (matcher.group(1) == null) { //so precisa do group(3), no meu caso
                    t = matcher.group(3); //users
                } else {
                    //t = matcher.group(1); //users de email
                }
                if (!t.equals("")) { // adiciona e conta
                    if (!ss.contains(t)) {
                        ss.add(t);
                        c++; // soma se adicionou.
                    }
                }
                //
                found = true;
            }
            if (!found) {
                //System.out.println("no matches found!");
            }

            // le proxima linha
            i++;
            s = f.readLine();
        }
        f.close(); // fecha arquivo
        System.out.println("Encontrados " + c + " usuarios"); // Contagem de Matchs
        System.out.println(ss);
    }

}

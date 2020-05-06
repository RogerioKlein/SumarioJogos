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
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CEPCounter {

    public static UniqueSet apenasCEP(String arquivo) {
        UniqueSet us = new UniqueSet();

        SimpleReader f = new SimpleReader(arquivo);
        String s = f.readLine();
        Pattern patterncep = Pattern.compile("(\\d{5}-\\d{3})");

        while (s != null) {
            Matcher matcher = patterncep.matcher(s);
            while (matcher.find()) {
                String cep = matcher.group(1);
                us.add(cep);
            }
            s = f.readLine();
        }

        f.close();

        return us;
    }

    public static Map somaCEP(String arquivo) {
        Map<String, Double> map = new HashMap<String, Double>();

        SimpleReader f = new SimpleReader(arquivo);
        String s = f.readLine();
        while (s != null) {
            String parts[] = s.split(" ");
            String cep = parts[0];
            Double value = Double.parseDouble(parts[1]);
            if (!map.containsKey(cep)) {
                map.put(cep, value);
            } else {
                map.put(cep, map.get(cep) + value);
            }
            s = f.readLine();
        }

        f.close();

        TreeMap<String, Double> sorted = new TreeMap<>(map);
        return sorted;
    }

    public static void main(String[] args) {
        UniqueSet us = apenasCEP("C:\\Users\\roger\\Documents\\NetBeansProjects\\mavenproject2\\src\\main\\java\\com\\mycompany\\mavenproject2\\packages.txt");
        Map mapa = somaCEP("C:\\Users\\roger\\Documents\\NetBeansProjects\\mavenproject2\\src\\main\\java\\com\\mycompany\\mavenproject2\\packages.txt");
        System.out.println("CEPs: " + us);
        System.out.println("Num CEPs: " + us.size());
        System.out.println("Soma: " + mapa);
    }
}

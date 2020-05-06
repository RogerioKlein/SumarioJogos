package com.mycompany.mavenproject2;

public class TestSimpleReader {

    public static void main(String[] args) {
        SimpleReader f = new SimpleReader("C:\\Users\\roger\\Desktop\\log-small.txt");
        int i = 1;
        String s = f.readLine();
        while (s != null) {
            System.out.println(i + ": " + s);
            i++;
            s = f.readLine();
        }
        f.close();
    }
}

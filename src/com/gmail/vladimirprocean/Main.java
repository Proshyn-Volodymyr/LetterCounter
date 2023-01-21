package com.gmail.vladimirprocean;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File textFile = new File("text.txt");
        FileTextReader ftr = new FileTextReader(textFile);
        ftr.readText(textFile);
        ftr.listCompose();
        ftr.getList().sort(new FrequencyComparator());

        System.out.println(ftr);
    }
}
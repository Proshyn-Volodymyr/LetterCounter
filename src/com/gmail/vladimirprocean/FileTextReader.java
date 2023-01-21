package com.gmail.vladimirprocean;

import java.io.*;
import java.util.ArrayList;

public class FileTextReader {
    private File fileIn;
    private ArrayList<LetterCounter> list = new ArrayList<>();


    public FileTextReader(File fileIn) {
        this.fileIn = fileIn;
    }

    public ArrayList<LetterCounter> getList() {
        return list;
    }

    public String readText(File file) {
        String result = "";
        String temp = "";
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                while((temp = br.readLine()) != null){
                    result += temp + System.lineSeparator();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        return result.substring(0, result.length() -1);
    }

    private int charCount(String text, char ch){
        int qnt = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ch){
                qnt++;
            }
        }
        return qnt;
    }
    public void listCompose(){
        File textFile = this.fileIn;
        String text = readText(textFile);
        int matches = 0;
        for (int i = 97; i < 122; i++) {
            matches = charCount(text, (char)i);
            if(matches == 0){
                continue;
            }
            list.add(new LetterCounter((char)i, matches));
        }

    }

        @Override
        public String toString () {
            StringBuilder sb = new StringBuilder();
            String str = "";
            for (LetterCounter lc : list
            ) {
                str = "Symbol " + lc.getCh() + " matched " + lc.getQuantity() + " times\n";
            sb.append(str);
            }
            return sb.toString();
        }
    }

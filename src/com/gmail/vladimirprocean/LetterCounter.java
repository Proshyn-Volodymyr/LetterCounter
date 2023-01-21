package com.gmail.vladimirprocean;

public class LetterCounter {
    private char ch;
    private int quantity;

    public LetterCounter(char ch, int quantity) {
        this.ch = ch;
        this.quantity = quantity;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

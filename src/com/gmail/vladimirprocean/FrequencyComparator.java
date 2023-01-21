package com.gmail.vladimirprocean;

import java.util.Comparator;

public class FrequencyComparator implements Comparator<LetterCounter> {
    @Override
    public int compare(LetterCounter o1, LetterCounter o2) {
        if (o1.getQuantity() > o2.getQuantity()) {
            return -1;
        } else if (o1.getQuantity() < o2.getQuantity()) {
            return 1;
        }
        return 0;
    }
}

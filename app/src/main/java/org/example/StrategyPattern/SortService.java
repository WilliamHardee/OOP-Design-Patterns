package org.example.StrategyPattern;

import java.util.*;


public class SortService {
    int[] array;

    private SortStrategy sortStrategy_;

    public SortService(int[] li) {
        this.array = li.clone();
    }

    public void setStrategy(SortStrategy sortStrategy) {
        this.sortStrategy_ = sortStrategy;
    }

    public void sort() {
        if (sortStrategy_ == null) {
            throw new IllegalStateException("SortStrategy is not set.");
        }
        sortStrategy_.sort(array);
    }

    public void sort(SortStrategy sortStrategy) {
        sortStrategy.sort(array);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
    
}

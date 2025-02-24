package org.example.StrategyPattern;

public class SortAsc implements SortStrategy {
    
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) { 
            for (int j = i + 1; j < array.length; j++) { 
                if (array[i] > array[j]) { 
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

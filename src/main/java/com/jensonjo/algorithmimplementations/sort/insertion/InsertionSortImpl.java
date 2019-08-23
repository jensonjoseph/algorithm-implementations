package com.jensonjo.algorithmimplementations.sort.insertion;

import org.springframework.stereotype.Component;

/**
 * Created by jensonkakkattil on Aug, 2019.
 */
@Component
public class InsertionSortImpl implements InsertionSort {
    @Override
    public int[] sort(int[] unordered) {
        int[] ordered = unordered.clone();
        int key, outerCount, innerCount;

        for (outerCount = 1; outerCount < ordered.length; outerCount++) {
            key = ordered[outerCount];

            for (innerCount = outerCount - 1;
                 innerCount >= 0 && ordered[innerCount] > key;
                 innerCount--) {
                ordered[innerCount + 1] = ordered[innerCount];
            }
            ordered[innerCount + 1] = key;
        }
        return ordered;
    }
}

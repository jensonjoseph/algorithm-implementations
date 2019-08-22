package com.jensonjo.algorithmimplementations;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jensonjo.algorithmimplementations.sort.insertion.InsertionSort;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlgorithmImplementationsApplicationTests {

    @Autowired
    InsertionSort insertionSort;

    @Test
    public void contextLoads() {
        int[] unorderedList = new int[]{3, 2, 1, 7, 5, 9, 8, 0};

        int[] sortedList = new int[]{0, 1, 2, 3, 5, 7, 8, 9};

        System.out.println(assertThat(insertionSort.sort(unorderedList).equals(sortedList)));
    }

}

package com.jensonjo.algorithmimplementations;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jensonjo.algorithmimplementations.sort.insertion.InsertionSort;

import lombok.extern.java.Log;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
public class AlgorithmImplementationsApplicationTests {

    @Autowired
    InsertionSort insertionSort;

    @Test
    public void contextLoads() {
        int[] unorderedList = new int[]{31, 41, 59, 26, 41, 58};
        //{3, 2, 1, 7, 5, 9, 8, 0};

        int[] sortedList = unorderedList.clone();
        Arrays.sort(sortedList);

        log.info("" + assertThat(insertionSort.sort(unorderedList).equals(sortedList)));
    }

}

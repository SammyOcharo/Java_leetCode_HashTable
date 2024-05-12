package com.samdev.JavaLeetCodeHashTable;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HowManyNumbersSmallerThanCurrentNumberTest {

    @Test
    void smallerNumbersThanCurrent() {

        int[] nums = {8, 1, 2, 2, 3};
        int[] results = {4, 0, 1, 1, 3};


        assertEquals(Arrays.toString(results), Arrays.toString(HowManyNumbersSmallerThanCurrentNumber.smallerNumbersThanCurrent(nums)));
    }
}
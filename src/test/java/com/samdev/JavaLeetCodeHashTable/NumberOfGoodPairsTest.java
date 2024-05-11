package com.samdev.JavaLeetCodeHashTable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfGoodPairsTest {

    @Test
    void numIdenticalPairs() {
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        assertEquals(4, NumberOfGoodPairs.numIdenticalPairs(nums1));
    }
}
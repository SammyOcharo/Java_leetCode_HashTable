package com.samdev.JavaLeetCodeHashTable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfGoodPairsTest {

    @Test
    void numIdenticalPairs() {
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        assertEquals(4, NumberOfGoodPairs.numIdenticalPairs(nums1));

        int[] nums2 = {1, 1, 1, 1};
        assertEquals(6, NumberOfGoodPairs.numIdenticalPairs(nums2));

        int[] nums3 = {1, 2, 3};
        assertEquals(0, NumberOfGoodPairs.numIdenticalPairs(nums3));
    }
}
package com.samdev.JavaLeetCodeHashTable;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HowManyNumbersSmallerThanCurrentNumberTest {

    @Test
    void smallerNumbersThanCurrent() {

        int[] nums = {8, 1, 2, 2, 3};
        int[] results = {4, 0, 1, 1, 3};

        int[] nums1 = {6, 5, 4, 8};
        int[] results1 = {2,1,0,3};

        int[] nums2 = {7, 7, 7, 7};
        int[] results2 = {0,0,0,0};



        assertEquals(Arrays.toString(results), Arrays.toString(HowManyNumbersSmallerThanCurrentNumber.smallerNumbersThanCurrent(nums)));
        assertEquals(Arrays.toString(results1), Arrays.toString(HowManyNumbersSmallerThanCurrentNumber.smallerNumbersThanCurrent(nums1)));
        assertEquals(Arrays.toString(results2), Arrays.toString(HowManyNumbersSmallerThanCurrentNumber.smallerNumbersThanCurrent(nums2)));
    }
}
package com.samdev.JavaLeetCodeHashMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberArithmeticTripletsTest {

    @Test
    void arithmeticTriplets() {

        int [] nums = {0,1,4,6,7,10};
        int diff = 3;

        int [] nums1 = {4,5,6,7,8,9};
        int diff1 = 2;

        assertEquals(2, NumberArithmeticTriplets.arithmeticTriplets(nums, diff));
        assertEquals(2, NumberArithmeticTriplets.arithmeticTriplets(nums1, diff1));
    }
}
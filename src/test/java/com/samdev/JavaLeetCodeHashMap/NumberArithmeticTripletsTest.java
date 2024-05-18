package com.samdev.JavaLeetCodeHashMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberArithmeticTripletsTest {

    @Test
    void arithmeticTriplets() {

        int [] nums = {0,1,4,6,7,10};
        int diff = 3;

        assertEquals(2, NumberArithmeticTriplets.arithmeticTriplets(nums, diff));
    }
}
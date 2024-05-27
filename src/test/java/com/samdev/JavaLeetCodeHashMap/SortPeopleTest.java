package com.samdev.JavaLeetCodeHashMap;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortPeopleTest {

    @Test
    void sortPeople() {

        String [] names = {"Alice","Bob","Bob"};
        int [] heights = {155,185,150};

        String [] expectedOutput = {"Bob","Alice","Bob"};

        assertEquals(Arrays.toString(expectedOutput), Arrays.toString(SortPeople.sortPeople(names, heights)));

        String [] names1 = {"Mary","John","Emma"};
        int [] heights1 = {180,165,170};

        String [] expectedOutput1 = {"Mary","Emma","John"};

        assertEquals(Arrays.toString(expectedOutput1), Arrays.toString(SortPeople.sortPeople(names1, heights1)));


    }
}
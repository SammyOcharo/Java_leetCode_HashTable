package com.samdev.JavaLeetCodeHashMap;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DesignOrderedStreamTest {

    @Test
    void insert() {
        DesignOrderedStream os = new DesignOrderedStream(5);
        List<String> result;

        result = os.insert(3, "ccccc");
        assertTrue(result.isEmpty());

        result = os.insert(1, "aaaaa");
        assertEquals(1, result.size());
        assertEquals("aaaaa", result.get(0));

        result = os.insert(2, "bbbbb");
        assertEquals(2, result.size());
        assertEquals("bbbbb", result.get(0));
        assertEquals("ccccc", result.get(1));

        result = os.insert(5, "eeeee");
        assertTrue(result.isEmpty());

        result = os.insert(4, "ddddd");
        assertEquals(2, result.size());
        assertEquals("ddddd", result.get(0));
        assertEquals("eeeee", result.get(1));
    }
}
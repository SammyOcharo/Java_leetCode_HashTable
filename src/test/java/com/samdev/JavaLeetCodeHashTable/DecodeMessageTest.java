package com.samdev.JavaLeetCodeHashTable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeMessageTest {

    @Test
    void decodeMessage() {
        assertEquals("this is a secret", DecodeMessage.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
        assertNotEquals("this is a deep secret", DecodeMessage.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
        assertEquals("the five boxing wizards jump quickly", DecodeMessage.decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
    }
}
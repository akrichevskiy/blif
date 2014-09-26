package com.sn;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimilarityTest {

    @Test
    public void testGetRatio() throws Exception {
        Similarity similarity = new Similarity(3, 2, 0, 0);
        assertEquals(0.6, similarity.getRatio(), 0.001);
    }
}
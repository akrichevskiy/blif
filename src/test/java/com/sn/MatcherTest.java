package com.sn;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class MatcherTest {

    @Test
    public void testCompleteMatch() throws Exception {
        Matrix data = new Matrix().loadFromFile(getClass().getResource("/testdata.blf").getPath());
        Matrix pattern = new Matrix().loadFromFile(getClass().getResource("/testpattern.blf").getPath());
        List<Similarity> actual = new Matcher().match(data, pattern);

        assertEquals(new Similarity(3,1,0,1).toString(), actual.get(0).toString());
        assertEquals(new Similarity(3,1,0,2).toString(), actual.get(1).toString());
        assertEquals(new Similarity(4,0,1,1).toString(), actual.get(2).toString());
    }
}
package com.sn;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class MatcherTest {

    @Test
    public void testCompleteMatch() throws Exception {
        Matrix data = new Matrix().loadFromFile(getClass().getResource("/testdata.blf").getPath());
        Matrix pattern = new Matrix().loadFromFile(getClass().getResource("/testpattern.blf").getPath());
        List<Double> actual = new Matcher().match(data, pattern);
        LinkedList<Double> expected = new LinkedList<Double>(Arrays.asList(1.0));
        assertEquals(expected, actual);
    }
}
package com.sn;


import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {

    @Test
    public void testLoadFromFile() throws Exception {
        Matrix matrix = new Matrix().loadFromFile(getClass().getResource("/simple.blf").getPath());

        char[][] expectedResult = new char[][]{
                {'+', ' ', '+', '+', ' '},
                {'+', '+', ' ', '+', ' '},
                {' ', '+', '+', '+', ' '}
        };
        Assert.assertArrayEquals(expectedResult, matrix.getField());
    }

}
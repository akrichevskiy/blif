package com.sn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Matrix {
    private char[][] field;
    private int columns = -1;
    private int rows = -1;

    public Matrix() {
    }

    public Matrix loadFromFile(String fileName) throws IOException {
        List<String> acc = getStringsFromFile(fileName);
        columns = acc.get(0).length();
        rows = acc.size();
        field = new char[rows][columns];
        populateField(acc);
        return this;
    }

    private List<String> getStringsFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        List<String> acc = new ArrayList<String>();
        try {
            String line = br.readLine();
            while (line != null) {
                acc.add(line);
                line = br.readLine();
            }
        } finally {
            br.close();
        }
        return acc;
    }

    private void populateField(List<String> acc) {
        int i = 0;
        for (String row : acc) {
            for (int k = 0; k < row.length(); k++) {
                char c = row.charAt(k);
                if (c != '\n') {
                    field[i][k] = c;
                }
            }
            i++;
        }
    }

    public static Matrix initWith(int[][] arr) {
        Matrix matrix = new Matrix();

        return matrix;
    }

    public char[][] getField() {
        return field;
    }
}

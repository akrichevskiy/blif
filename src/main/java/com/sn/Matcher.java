package com.sn;

import java.util.LinkedList;
import java.util.List;

public class Matcher {
    public List<Double> match(Matrix data, Matrix pattern) {
        List<Double> result = new LinkedList<Double>();
        for (int i = 0; i < data.getRows() - pattern.getRows() + 1; i++) {
            for (int j = 0; j < data.getColumns() - pattern.getColumns() + 1; j++) {
                Similarity similarity = calculateSimilarity(data, pattern, i, j);
                if (similarity.isGoodEnough()) {
                    result.add(similarity.getRatio());
                }
            }
        }
        return result;
    }

    public Similarity calculateSimilarity(Matrix data, Matrix pattern, int startRow, int startCol) {
        int hit = 0;
        int miss = 0;
        for (int k = 0; k < pattern.getRows(); k++) {
            for (int m = 0; m < pattern.getColumns(); m++) {
                if (data.getField()[k + startRow][m + startCol] == pattern.getField()[k][m]) {
                    hit++;
                } else {
                    miss++;
                }
            }
        }
        return new Similarity(hit, miss);
    }
}

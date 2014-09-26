package com.sn;

public class Similarity {
    private double ratio;

    private int startRow;
    private int startCol;

    public int getStartRow() {
        return startRow;
    }

    public int getStartCol() {
        return startCol;
    }

    public Similarity(int hit, int miss, int startRow, int startCol) {
        this.ratio = (double)hit / (hit + miss);
        this.startCol = startCol;
        this.startRow = startRow;
    }

    public boolean isGoodEnough() {
        double threshold = 0.7;
        double delta = 0.0001;
        return ratio - threshold > delta;
    }

    public double getRatio() {
        return ratio;
    }

    public String toString() {
        return String.format("ratio[%f], startRow[%d], startCol[%d]", ratio, startRow, startCol);
    }
 }

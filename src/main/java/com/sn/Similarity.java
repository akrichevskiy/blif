package com.sn;

public class Similarity {
    private double ratio;
    private double threshold = 0.9;

    public Similarity(int hit, int miss) {
        this.ratio = hit / (hit + miss);
    }

    public boolean isGoodEnough() {
        return ratio > threshold;
    }

    public double getRatio() {
        return ratio;
    }
}

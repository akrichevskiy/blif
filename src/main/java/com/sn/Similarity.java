package com.sn;

public class Similarity {
    private double ratio;

    public Similarity(int hit, int miss) {
        this.ratio = (double)hit / (hit + miss);
    }

    public boolean isGoodEnough() {
        double threshold = 0.7;
        double delta = 0.0001;
        return ratio - threshold > delta;
    }

    public double getRatio() {
        return ratio;
    }
}

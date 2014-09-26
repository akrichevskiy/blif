package com.sn;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("usage:\n blif.jar <test-data.blf> <pattern.blf>");
            System.exit(0);
        }

        Matrix data = new Matrix().loadFromFile(args[0]);
        Matrix pattern = new Matrix().loadFromFile(args[1]);
        Matcher matcher = new Matcher();
        List<Similarity> result = matcher.match(data, pattern);
        for (Similarity similarity : result) {
            System.out.println(String.format("similarity with ratio:%f,  top left corner(%d,%d) ", similarity.getRatio(), similarity.getStartRow(), similarity.getStartCol()));
        }
    }
}

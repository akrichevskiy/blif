package com.sn;

import java.io.IOException;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );
        Matrix data = new Matrix().loadFromFile("/Users/akrichevskiy/workspace/blif/src/main/resources/TestData.blf");
        Matrix torpedo = new Matrix().loadFromFile("/Users/akrichevskiy/workspace/blif/src/main/resources/SlimeTorpedo.blf");

        Matcher matcher = new Matcher();
        List<Double> result =  matcher.match(data, torpedo);
        for (Double similarity : result) {
            System.out.println(String.format("similarity found, ratio:%f", similarity) );
        }
    }
}

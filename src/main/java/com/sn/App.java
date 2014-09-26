package com.sn;

import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );
        Matrix data = new Matrix().loadFromFile("/Users/akrichevskiy/workspace/blif/src/main/resources/TestData.blf");
        Matrix torpedo = new Matrix().loadFromFile("/Users/akrichevskiy/workspace/blif/src/main/resources/SlimeTorpedo.blf");
    }
}

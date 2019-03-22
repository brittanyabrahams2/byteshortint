package com.company;

public class Main {

    public static void main(String[] args) {

            byte ranByte = 7;
            short ranShort = 32;
            int ranInt = -350;
            long ranLong = 50000L + 10L * (ranByte + ranShort + ranInt);
            System.out.println(ranLong);


    }
}

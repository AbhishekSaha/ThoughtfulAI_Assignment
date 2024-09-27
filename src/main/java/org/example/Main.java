package org.example;

public class Main {


    static String sort(long width, long height, long length, long mass) {
        // Check if provided negative values and throw exception if so
        if (width < 0 || height < 0 || length < 0 || mass < 0){
            throw new IllegalArgumentException();
        }

        boolean heavy = mass> 20;
        boolean bulky = width > 150 || height > 150 || length > 150 || (width * height * length) > 1000000;

        if (heavy && bulky) {
            return "REJECTED";
        }

        // XOR method to check if either heavy or bulky
        if (heavy ^ bulky) {
            return "SPECIAL";
        }


        return "STANDARD";
    }

    public static void main(String[] args) {
        String packageStatus = sort(149, 149, 149, 10);
        System.out.println(packageStatus);
    }


}
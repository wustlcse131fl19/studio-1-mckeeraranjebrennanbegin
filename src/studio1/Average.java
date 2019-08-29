package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        double no1 = ap.nextDouble("The first integer to be averaged.");
        double no2 = ap.nextDouble("The second integer to be averaged.");

        double no3 = ((no1 + no2) / 2);

        System.out.println(no3);
    }
}
package com.example.semen.mvprandomgenerator.model;

import java.util.Random;

public class RandomGenerator {
    private static int count;
    private static int sum;

    public static int generateResult() {
        int result = new Random().nextInt(100);
        sum = sum + result;
        count++;
        return result;
    }

    public static int getCount() {
        return count;
    }

    public static int getSum() {
        return sum;
    }
}

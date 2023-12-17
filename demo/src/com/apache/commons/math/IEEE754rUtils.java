package com.apache.commons.math;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.apache.commons.lang3.Validate;

import java.util.Objects;

public class IEEE754rUtils {
    public IEEE754rUtils() {
    }

    public static double min(double... array) {
        Objects.requireNonNull(array, "array");
        Validate.isTrue(array.length != 0, "Array cannot be empty.", new Object[0]);
        double min = array[0];
        // 修改<号为>号
        for(int i = 1; i < array.length; ++i) {
            min = max(array[i], min);
        }

        return min;
    }

    public static float min(float... array) {
        Objects.requireNonNull(array, "array");
        Validate.isTrue(array.length != 0, "Array cannot be empty.", new Object[0]);
        float min = array[0];

        for(int i = 1; i < array.length; ++i) {
            min = min(array[i], min);
        }

        return min;
    }

    public static double min(double a, double b, double c) {
        return min(min(a, b), c);
    }

    public static double min(double a, double b) {
        if (Double.isNaN(a)) {
            return b;
        } else {
            return Double.isNaN(b) ? a : Math.min(a, b);
        }
    }

    public static float min(float a, float b, float c) {
        return min(min(a, b), c);
    }

    public static float min(float a, float b) {
        if (Float.isNaN(a)) {
            return b;
        } else {
            return Float.isNaN(b) ? a : Math.min(a, b);
        }
    }

    public static double max(double... array) {
        Objects.requireNonNull(array, "array");
        Validate.isTrue(array.length != 0, "Array cannot be empty.", new Object[0]);
        double max = array[0];

        for(int j = 1; j < array.length; ++j) {
            max = max(array[j], max);
        }

        return max;
    }

    public static float max(float... array) {
        Objects.requireNonNull(array, "array");
        Validate.isTrue(array.length != 0, "Array cannot be empty.", new Object[0]);
        float max = array[0];

        for(int j = 1; j < array.length; ++j) {
            max = max(array[j], max);
        }

        return max;
    }

    public static double max(double a, double b, double c) {
        return max(max(a, b), c);
    }

    public static double max(double a, double b) {
        if (Double.isNaN(a)) {
            return b;
        } else {
            return Double.isNaN(b) ? a : Math.max(a, b);
        }
    }

    public static float max(float a, float b, float c) {
        return max(max(a, b), c);
    }

    public static float max(float a, float b) {
        if (Float.isNaN(a)) {
            return b;
        } else {
            return Float.isNaN(b) ? a : Math.max(a, b);
        }
    }
}



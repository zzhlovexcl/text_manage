package com.apache.commons.math;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestIEEE754rUtils {

    @Test
    public void testMin() {
        IEEE754rUtils A = new IEEE754rUtils();
        double ary[] = {1,2,3,4,5};
        double result = A.min(ary);
        Assert.assertEquals(1,result,0.0);
    }

    @Test
    public void testMin_abc() {
        IEEE754rUtils A = new IEEE754rUtils();
        double a = 1, b = 2, c = 3;
        double result = A.min(a,b,c);
        Assert.assertEquals(1,result,0.0);
    }

    @Test
    public void testMin_ab() {
        IEEE754rUtils A = new IEEE754rUtils();
        double a = 1, b = 2;
        double result = A.min(a,b);
        Assert.assertEquals(1,result,0.0);
    }

    @Test
    public void testMax() {
        IEEE754rUtils A = new IEEE754rUtils();
        double ary[] = {1,2,3,4,5};
        double result = A.max(ary);
        Assert.assertEquals(5,result,0.0);
    }

    @Test
    public void testMax_abc() {
        IEEE754rUtils A = new IEEE754rUtils();
        double a = 1, b = 2, c = 3;
        double result = A.max(a,b,c);
        Assert.assertEquals(3,result,0.0);
    }

    @Test
    public void testMax_ab() {
        IEEE754rUtils A = new IEEE754rUtils();
        double a = 1, b = 2;
        double result = A.max(a,b);
        Assert.assertEquals(2,result,0.0);
    }

}


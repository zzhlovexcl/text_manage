package com.apache.commons.math;

public class IEEE754rUtilsMain {
    public static void main(String[] args) {
        IEEE754rUtils A = new IEEE754rUtils();   //实例化
        double ary[] = {1,2,3,4,5};
        double result1 = A.min(ary);
        double result2 = A.min(ary[0],ary[1],ary[2]);
        double result3 = A.min(ary[0],ary[1]);
        double result4 = A.max(ary);
        double result5 = A.max(ary[2],ary[3],ary[4]);
        double result6 = A.max(ary[3],ary[4]);
        if(result1!=1)
        {
            System.err.println("错误方法math/IEEE754rUtils/min/\n" +
                    "预期：1"+"\n"+"实际："+result1);
        }
        else{}
        if(result2!=1)
        {
            System.err.println("错误方法math/IEEE754rUtils/min/\n" +
                    "预期：1"+"\n"+"实际："+result2);
        }
        else{}
        if(result3!=1)
        {
            System.err.println("错误方法math/IEEE754rUtils/min/\n" +
                    "预期：1"+"\n"+"实际："+result3);
        }
        else{}
        if(result4!=5)
        {
            System.err.println("错误方法math/IEEE754rUtils/max/\n"+"预期：5"+"\n"+"实际："+result4);
        }
        else{}
        if(result5!=5)
        {
            System.err.println("错误方法math/IEEE754rUtils/max/\n"+"预期：5"+"\n"+"实际："+result5);
        }
        else{}
        if(result6!=5)
        {
            System.err.println("错误方法math/IEEE754rUtils/max/\n"+"预期：5"+"\n"+"实际："+result6);
        }
        else{}
    }
}

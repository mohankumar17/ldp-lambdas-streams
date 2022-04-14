package com.java.lambdastreams;

@FunctionalInterface
interface Add{
    public int addNumbers(int a,int b);
}

public class ArthimeticOpsLamda {
    public static void main(String args[]){
        Add lambdaVar=(int a,int b)->a+b;
        int res=lambdaVar.addNumbers(12,13);
        System.out.println(res);
    }
}

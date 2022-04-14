package com.java.lambdastreams;

import java.util.ArrayList;
import java.util.HashMap;

public class LambdaDemo {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );

        HashMap<Character,Integer> mp=new HashMap<>();
        mp.put('A',1);
        mp.put('B',2);
        mp.put('C',3);

        mp.forEach((k,v)->{
            System.out.println(k+" "+v);
        });
    }
}

package com.java.lambdastreams;

/*To store the lambda expression in a variable,
 a functional interface (an interface with only one abstract method) must be created.
The interface reference can be used to store lambda expression. */

@FunctionalInterface
interface LambdaStore{
    public int run(int num);
}
/*interface LambdaStore{
    public void run(int num);
}*/
/*interface LambdaStore{
    public void run(ArrayList<Integer> numbers);
}*/
public class LambdaStoreDemo {
    public static void main(String args[]){
        /*ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);*/
        //numbers.forEach( (n) -> { System.out.println(n); } );
        //LambdaStore lambdaVar=(n) -> { System.out.println(n); };
        /*LambdaStore lambdaVar=(n) -> {
            return n*n;
        };*/
        LambdaStore lambdaVar=(n) -> n*n;

        //lambdaVar is the interface reference that refers to the lambda expression
        //lambdaVar.run(numbers);
        //lambdaVar.run(9);
        System.out.println(lambdaVar.run(9));
    }
}

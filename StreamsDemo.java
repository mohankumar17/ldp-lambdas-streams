package com.java.lambdastreams;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;  //Streams Package

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class StreamsDemo {
    public static void main(String args[]){
        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenovo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",26000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        List<Float> productPriceList2 =productsList.stream()
                .filter(p -> p.price > 27000)// filtering data
                .map(p->p.price)        // applies operations on each element of the stream (here fetching price)
                .collect(Collectors.toList()); // converting stream to List - collecting as list

        System.out.println(productPriceList2);

        Float totalPrice = productsList.stream()
                .map(product->product.price)
                .reduce(0.0f,(sum, price)->sum+price);   // accumulating price
        System.out.println(totalPrice);
    }
}

package com.example.product;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    List<Product> productList = new ArrayList<>();
        Product product = Product.builder()
                .id(1)
                .title("prod 1")
                .price(5000)
                .color("white")
                .build();

        Product product1 = Product.builder()
                .id(2)
                .title("prod 2")
                .price(1200)
                .color("black")
                .build();

        Product product2 = Product.builder()
                .id(3)
                .title("prod 3")
                .price(75000)
                .color("red")
                .build();
        public ProductRepository(){
            productList.add(product);
            productList.add(product1);
            productList.add(product2);
        }

    public List<Product> getAllProducts(){
        return productList;
    }

    public Product getOne(int id){
        return  productList.get(id);
    }
}

package com.telusko.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductDB db;

//    public void addProduct(Product p) {
//        db.save(p);
//    }
//

    public List<Product> getAllProducts() {
        return db.findAll();
    }

//    public Product getProduct(String name) {
//
//        for(Product p:products) {
//            if(p.getName().equals(name))
//                return p;
//        }
//
//        return null;
//    }
//
//    public List<Product> getProductWithText(String text) {
//
//        String str = text.toLowerCase();
//
//        List<Product> prods = new ArrayList<>();
//
//        for(Product p: products) {
//            String name = p.getName().toLowerCase();
//            String type = p.getType().toLowerCase();
//            String place = p.getPlace().toLowerCase();
//
//            if(name.contains(str) || type.contains(str) || place.contains(str)) {
//                prods.add(p);
//            }
//        }
//
//        return prods;
//    }

}

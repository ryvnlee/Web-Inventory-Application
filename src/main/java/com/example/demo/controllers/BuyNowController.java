package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class BuyNowController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/buyNow")
    public String buyNow(@RequestParam("productID") Long theId) {
        Optional<Product> productOptional = productRepository.findById(theId);

        if (productOptional.isPresent()) {
            Product product = productOptional.get();
            int productInv = product.getInv();

            if (productInv > 0) {
                product.setInv(productInv - 1);
                productRepository.save(product);
            } else {
                return "purchaseerror";
            }
        } else {
            return "purchaseerror";
        }

        return "purchasesuccess";
    }
}

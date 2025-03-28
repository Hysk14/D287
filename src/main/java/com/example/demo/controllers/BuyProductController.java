package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class BuyProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID") Long productID, Model model ) {
        System.out.println("Submitted productID: " + productID);

        Optional<Product> optionalProduct = productRepository.findById(productID);

        if(optionalProduct.isPresent()) {
            Product product = optionalProduct.get();

            if (product.getInv() > 0) {
                product.setInv(product.getInv() - 1);
                productRepository.save(product);
                return "redirect:/purchaseSuccess";
            } else {
                return "redirect:/purchaseFail";
            }
        } else {
            return "redirect:/purchaseFail";
        }
    }

    // Show success page
    @GetMapping("/purchaseSuccess")
    public String showPurchaseSuccessPage() {
        return "purchaseSuccess";
    }

    // Show failure page
    @GetMapping("/purchaseFail")
    public String showPurchaseFailPage() {
        return "purchaseFail";
    }
}

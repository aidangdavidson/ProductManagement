package dmacc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import dmacc.beans.Product;
import lombok.RequiredArgsConstructor;

/**
 * @author aidan - agdavidson
 * CIS175 - Spring 2024
 * Mar 28, 2024
 */
@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductRepository productRepository;
    
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public String productList(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "product-list";
    }

    @GetMapping("/add")
    public String showAddForm(Product product) {
        return "add-product";
    }

    @PostMapping("/add")
    public String addProduct(Product product) {
        productRepository.save(product);
        return "redirect:/";
    }


    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") long id, Model model) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product Id:" + id));
        productRepository.delete(product);
        return "redirect:/";
    }
}

package uk.ac.westminster.lecture_g4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.westminster.lecture_g4.dto.product;
import uk.ac.westminster.lecture_g4.services.productService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class productController {

    @Autowired
    private productService productService;

    @GetMapping
    public List<product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public product getProductById(@PathVariable Long id) {
        return productService.getProductById(id)
                .orElse(null);
    }

    @PostMapping
    public product saveProduct(@RequestBody product product) {
        return productService.addProduct(product);
    }

    @DeleteMapping("/{id}")
    public String deleteProductById(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "Product deleted successfully";
    }
}
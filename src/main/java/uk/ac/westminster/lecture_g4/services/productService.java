package uk.ac.westminster.lecture_g4.services;

import org.springframework.stereotype.Service;
import uk.ac.westminster.lecture_g4.dto.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class productService {

    private List<product> products = new ArrayList<>();
    private Long nextId = 1L;

    public List<product> getAllProducts() {
        return products;
    }

    public Optional<product> getProductById(Long id) {
        return products.stream()
                .filter(p -> Objects.equals(p.getId(), id)) // Use Objects.equals or == for safe comparison
                .findFirst();
    }

    public product addProduct(product product) {
        product.setId(nextId);
        nextId += 1L;
        products.add(product);
        return product;
    }

    public void deleteProduct(Long id) {
        products.removeIf(p -> Objects.equals(p.getId(), id));
    }
}
package com.personal.project.service;

import com.personal.project.entity.Products;
import com.personal.project.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Flux<Products> getProducts() {
        return productRepository.findAll().delayElements(Duration.ofSeconds(5));
    }
}

package com.personal.project.repository;

import com.personal.project.entity.Products;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends ReactiveCrudRepository<Products, Integer> {
}

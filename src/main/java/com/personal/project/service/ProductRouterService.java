package com.personal.project.service;

import com.personal.project.entity.Products;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.stream.Stream;

@Service
public class ProductRouterService {

    public Flux<Products> getAllProducts(){
        Products p1 = new Products();
        p1.setId(1);
        p1.setName("Chocolate");

        Products p2 = new Products();
        p1.setId(2);
        p1.setName("Cookie");

        return  Flux.fromStream(Stream.of(p1, p2)).delayElements(Duration.ofSeconds(3));
    }
}

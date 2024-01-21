package com.personal.project.config;

import com.personal.project.entity.Products;
import com.personal.project.service.ProductRouterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration
public class RoutesConfig {

    private final ProductRouterService productRouterService;

    public RoutesConfig(ProductRouterService productRouterService){
        this.productRouterService = productRouterService;
    }

    @Bean
    public RouterFunction<ServerResponse> router(){
        return route().GET("/route-products", request -> ok().body(productRouterService.getAllProducts(), Products.class)).build();
    }
}

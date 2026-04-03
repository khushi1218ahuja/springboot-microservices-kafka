package com.example.cartservice.service;

import com.example.cartservice.entity.Cart;
import com.example.cartservice.repository.CartRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CartService {

    private final CartRepository cartRepository;
    private final RestTemplate restTemplate;

    public CartService(CartRepository cartRepository, RestTemplate restTemplate) {
        this.cartRepository = cartRepository;
        this.restTemplate = restTemplate;
    }

    public Cart addToCart(Cart cart) {

        // Call USER SERVICE
        String userUrl = "http://localhost:8082/users/" + cart.getUserId();
        Object user = restTemplate.getForObject(userUrl, Object.class);

        // Call PRODUCT SERVICE
        String productUrl = "http://localhost:8081/products/" + cart.getProductId();
        Object product = restTemplate.getForObject(productUrl, Object.class);

        return cartRepository.save(cart);
    }
}

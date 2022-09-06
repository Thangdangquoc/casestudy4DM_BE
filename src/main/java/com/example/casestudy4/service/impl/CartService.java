package com.example.casestudy4.service.impl;

import com.example.casestudy4.model.Cart;
import com.example.casestudy4.repository.CartRepository;
import com.example.casestudy4.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CartService implements ICartService {
    @Autowired
    private CartRepository cartRepository;
    @Override
    public Cart save(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public void delete(Long id) {
        cartRepository.deleteById(id);
    }

    @Override
    public Optional<Cart> findById(Long id) {
        return cartRepository.findById(id);
    }

    @Override
    public List<Cart> findAll() {
        return cartRepository.findAll();
    }
}

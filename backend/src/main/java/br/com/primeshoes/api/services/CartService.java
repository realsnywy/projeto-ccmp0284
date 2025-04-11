package br.com.primeshoes.api.services;

import br.com.primeshoes.api.dtos.CartDTO;
import br.com.primeshoes.api.entities.Cart;
import br.com.primeshoes.api.mappers.CartMapper;
import br.com.primeshoes.api.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private CartMapper cartMapper;

    public CartDTO getCartByUserId(int userId) {
        return cartMapper.toDTO(cartRepository.findByUserId(userId).orElseThrow(() -> new RuntimeException("Cart not found")));
    }

    public void addItemToCart(int userId, CartDTO.CartItemDTO itemDTO) {
        Cart cart = cartRepository.findByUserId(userId).orElse(new Cart(userId));
        cart.addItem(itemDTO.variationId(), itemDTO.quantity());
        cartRepository.save(cart);
    }

    public void removeItemFromCart(int userId, int variationId) {
        Cart cart = cartRepository.findByUserId(userId).orElseThrow(() -> new RuntimeException("Cart not found"));
        cart.removeItem(variationId);
        cartRepository.save(cart);
    }

    public void clearCart(int userId) {
        Cart cart = cartRepository.findByUserId(userId).orElseThrow(() -> new RuntimeException("Cart not found"));
        cart.clearCart();
        cartRepository.save(cart);
    }
}
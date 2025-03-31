package br.com.primeshoes.api.controllers;

import br.com.primeshoes.api.dtos.CartDTO;
import br.com.primeshoes.api.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/{userId}")
    public CartDTO getCartByUserId(@PathVariable int userId) {
        return cartService.getCartByUserId(userId);
    }

    @PostMapping("/{userId}/items")
    public void addItemToCart(@PathVariable int userId, @RequestBody CartDTO.CartItemDTO itemDTO) {
        cartService.addItemToCart(userId, itemDTO);
    }

    @DeleteMapping("/{userId}/items/{variationId}")
    public void removeItemFromCart(@PathVariable int userId, @PathVariable int variationId) {
        cartService.removeItemFromCart(userId, variationId);
    }

    @DeleteMapping("/{userId}/clear")
    public void clearCart(@PathVariable int userId) {
        cartService.clearCart(userId);
    }
}
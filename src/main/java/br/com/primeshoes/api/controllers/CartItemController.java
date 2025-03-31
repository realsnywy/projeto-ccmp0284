package br.com.primeshoes.api.controllers;

import br.com.primeshoes.api.dtos.CartItemDTO;
import br.com.primeshoes.api.services.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart-items")
public class CartItemController {

    @Autowired
    private CartItemService cartItemService;

    @GetMapping("/{cartId}")
    public List<CartItemDTO> getItemsByCartId(@PathVariable int cartId) {
        return cartItemService.getItemsByCartId(cartId);
    }

    @PostMapping
    public void addCartItem(@RequestBody CartItemDTO cartItemDTO) {
        cartItemService.addCartItem(cartItemDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteCartItem(@PathVariable int id) {
        cartItemService.deleteCartItem(id);
    }
}
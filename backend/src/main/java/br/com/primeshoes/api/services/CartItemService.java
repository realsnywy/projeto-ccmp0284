package br.com.primeshoes.api.services;

import br.com.primeshoes.api.dtos.CartItemDTO;
import br.com.primeshoes.api.entities.CartItem;
import br.com.primeshoes.api.mappers.CartItemMapper;
import br.com.primeshoes.api.repositories.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CartItemService {

    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    private CartItemMapper cartItemMapper;

    public List<CartItemDTO> getItemsByCartId(int cartId) {
        return cartItemRepository.findByCartId(cartId).stream().map(cartItemMapper::toDTO).collect(Collectors.toList());
    }

    public void addCartItem(CartItemDTO cartItemDTO) {
        CartItem cartItem = cartItemMapper.toEntity(cartItemDTO);
        cartItemRepository.save(cartItem);
    }

    public void deleteCartItem(int id) {
        cartItemRepository.deleteById(id);
    }
}
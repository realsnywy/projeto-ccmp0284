package br.com.primeshoes.api.mappers;

import br.com.primeshoes.api.dtos.CartDTO;
import br.com.primeshoes.api.entities.Cart;
import org.springframework.stereotype.Component;
import java.util.stream.Collectors;
import br.com.primeshoes.api.entities.CartItem;

@Component
public class CartMapper {

    public CartDTO toDTO(Cart cart) {
        return new CartDTO(
            cart.getId(),
            cart.getUserId(),
            cart.getItems().stream()
                .map(item -> new CartDTO.CartItemDTO(
                    item.getVariationId(),
                    item.getQuantity(),
                    item.getSubtotal()
                ))
                .collect(Collectors.toList()),
            cart.getTotalPrice()
        );
    }

    public Cart toEntity(CartDTO dto) {
        Cart cart = new Cart(dto.userId());
        cart.setId(dto.id());
        cart.setItems(dto.items().stream()
            .map(itemDTO -> {
                CartItem item = new CartItem(itemDTO.variationId(), itemDTO.quantity());
                item.setSubtotal(itemDTO.subtotal());
                return item;
            })
            .collect(Collectors.toList()));
        return cart;
    }
}
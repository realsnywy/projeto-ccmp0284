package br.com.primeshoes.api.mappers;

import br.com.primeshoes.api.dtos.CartItemDTO;
import br.com.primeshoes.api.entities.CartItem;
import org.springframework.stereotype.Component;

@Component
public class CartItemMapper {

    public CartItemDTO toDTO(CartItem cartItem) {
        return new CartItemDTO(
            cartItem.getId(),
            cartItem.getCartId(),
            cartItem.getVariationId(),
            cartItem.getQuantity(),
            cartItem.getSubtotal()
        );
    }

    public CartItem toEntity(CartItemDTO dto) {
        CartItem cartItem = new CartItem(dto.variationId(), dto.quantity());
        cartItem.setId(dto.id());
        cartItem.setCartId(dto.cartId());
        cartItem.setSubtotal(dto.subtotal());
        return cartItem;
    }
}
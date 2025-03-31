package br.com.primeshoes.api.mappers;

import br.com.primeshoes.api.dtos.CartItemDTO;
import br.com.primeshoes.api.entities.CartItem;
import org.springframework.stereotype.Component;

@Component
public class CartItemMapper {

    public CartItemDTO toDTO(CartItem cartItem) {
        CartItemDTO dto = new CartItemDTO();
        dto.id = cartItem.getId();
        dto.cartId = cartItem.getCartId();
        dto.variationId = cartItem.getVariationId();
        dto.quantity = cartItem.getQuantity();
        dto.subtotal = cartItem.getSubtotal();
        return dto;
    }

    public CartItem toEntity(CartItemDTO dto) {
        CartItem cartItem = new CartItem(dto.variationId, dto.quantity);
        cartItem.setId(dto.id);
        cartItem.setCartId(dto.cartId);
        cartItem.setSubtotal(dto.subtotal);
        return cartItem;
    }
}
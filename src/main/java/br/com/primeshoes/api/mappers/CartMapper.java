package br.com.primeshoes.api.mappers;

import br.com.primeshoes.api.dtos.CartDTO;
import br.com.primeshoes.api.entities.Cart;
import org.springframework.stereotype.Component;
import java.util.stream.Collectors;
import br.com.primeshoes.api.entities.CartItem;

@Component
public class CartMapper {

    public CartDTO toDTO(Cart cart) {
        CartDTO dto = new CartDTO();
        dto.id = cart.getId();
        dto.userId = cart.getUserId();
        dto.items = cart.getItems().stream().map(item -> {
            CartDTO.CartItemDTO itemDTO = new CartDTO.CartItemDTO();
            itemDTO.variationId = item.getVariationId();
            itemDTO.quantity = item.getQuantity();
            itemDTO.subtotal = item.getSubtotal();
            return itemDTO;
        }).collect(Collectors.toList());
        dto.totalPrice = cart.getTotalPrice();
        return dto;
    }

    public Cart toEntity(CartDTO dto) {
        Cart cart = new Cart(dto.userId);
        cart.setId(dto.id);
        cart.setItems(dto.items.stream().map(itemDTO -> {
            CartItem item = new CartItem(itemDTO.variationId, itemDTO.quantity);
            item.setSubtotal(itemDTO.subtotal);
            return item;
        }).collect(Collectors.toList()));
        return cart;
    }
}
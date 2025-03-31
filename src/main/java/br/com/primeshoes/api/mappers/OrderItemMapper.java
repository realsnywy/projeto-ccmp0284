package br.com.primeshoes.api.mappers;

import br.com.primeshoes.api.dtos.OrderItemDTO;
import br.com.primeshoes.api.entities.OrderItem;
import org.springframework.stereotype.Component;

@Component
public class OrderItemMapper {

    public OrderItemDTO toDTO(OrderItem orderItem) {
        OrderItemDTO dto = new OrderItemDTO();
        dto.id = orderItem.getId();
        dto.orderId = orderItem.getOrderId();
        dto.variationId = orderItem.getVariationId();
        dto.quantity = orderItem.getQuantity();
        dto.subtotal = orderItem.getSubtotal();
        return dto;
    }

    public OrderItem toEntity(OrderItemDTO dto) {
        OrderItem orderItem = new OrderItem(dto.orderId, dto.variationId, dto.quantity, dto.subtotal);
        orderItem.setId(dto.id);
        return orderItem;
    }
}
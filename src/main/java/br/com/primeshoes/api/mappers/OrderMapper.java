package br.com.primeshoes.api.mappers;

import br.com.primeshoes.api.dtos.OrderDTO;
import br.com.primeshoes.api.entities.Order;
import org.springframework.stereotype.Component;
import java.util.stream.Collectors;
import br.com.primeshoes.api.entities.OrderItem;

@Component
public class OrderMapper {

    public OrderDTO toDTO(Order order) {
        OrderDTO dto = new OrderDTO();
        dto.id = order.getId();
        dto.userId = order.getUserId();
        dto.items = order.getItems().stream().map(item -> {
            OrderDTO.OrderItemDTO itemDTO = new OrderDTO.OrderItemDTO();
            itemDTO.productId = item.getProductId();
            itemDTO.quantity = item.getQuantity();
            return itemDTO;
        }).collect(Collectors.toList());
        dto.totalPrice = order.getTotalPrice();
        dto.status = order.getStatus();
        dto.paymentMethod = order.getPaymentMethod();
        dto.trackingCode = order.getTrackingCode();
        dto.createdAt = order.getCreatedAt();
        return dto;
    }

    public Order toEntity(OrderDTO dto) {
        Order order = new Order();
        order.setId(dto.id);
        order.setUserId(dto.userId);
        order.setItems(dto.items.stream().map(itemDTO -> {
            OrderItem item = new OrderItem();
            item.setProductId(itemDTO.productId);
            item.setQuantity(itemDTO.quantity);
            return item;
        }).collect(Collectors.toList()));
        order.setTotalPrice(dto.totalPrice);
        order.setStatus(dto.status);
        order.setPaymentMethod(dto.paymentMethod);
        order.setTrackingCode(dto.trackingCode);
        order.setCreatedAt(dto.createdAt);
        return order;
    }
}
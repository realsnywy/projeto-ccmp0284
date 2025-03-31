package br.com.primeshoes.api.services;

import br.com.primeshoes.api.dtos.OrderItemDTO;
import br.com.primeshoes.api.entities.OrderItem;
import br.com.primeshoes.api.mappers.OrderItemMapper;
import br.com.primeshoes.api.repositories.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private OrderItemMapper orderItemMapper;

    public List<OrderItemDTO> getItemsByOrderId(int orderId) {
        return orderItemRepository.findByOrderId(orderId).stream().map(orderItemMapper::toDTO).collect(Collectors.toList());
    }

    public void addOrderItem(OrderItemDTO orderItemDTO) {
        OrderItem orderItem = orderItemMapper.toEntity(orderItemDTO);
        orderItemRepository.save(orderItem);
    }

    public void deleteOrderItem(int id) {
        orderItemRepository.deleteById(id);
    }
}
package br.com.primeshoes.api.services;

import br.com.primeshoes.api.dtos.OrderDTO;
import br.com.primeshoes.api.entities.Order;
import br.com.primeshoes.api.mappers.OrderMapper;
import br.com.primeshoes.api.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderMapper orderMapper;

    public List<OrderDTO> getAllOrders() {
        return orderRepository.findAll().stream().map(orderMapper::toDTO).collect(Collectors.toList());
    }

    public OrderDTO getOrderById(int id) {
        return orderMapper.toDTO(orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found")));
    }

    public OrderDTO createOrder(OrderDTO orderDTO) {
        Order order = orderMapper.toEntity(orderDTO);
        return orderMapper.toDTO(orderRepository.save(order));
    }

    public OrderDTO updateOrder(int id, OrderDTO orderDTO) {
        Order order = orderMapper.toEntity(orderDTO);
        order.setId(id);
        return orderMapper.toDTO(orderRepository.save(order));
    }

    public void deleteOrder(int id) {
        orderRepository.deleteById(id);
    }
}
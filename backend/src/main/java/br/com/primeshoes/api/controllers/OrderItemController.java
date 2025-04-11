package br.com.primeshoes.api.controllers;

import br.com.primeshoes.api.dtos.OrderItemDTO;
import br.com.primeshoes.api.services.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order-items")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @GetMapping("/{orderId}")
    public List<OrderItemDTO> getItemsByOrderId(@PathVariable int orderId) {
        return orderItemService.getItemsByOrderId(orderId);
    }

    @PostMapping
    public void addOrderItem(@RequestBody OrderItemDTO orderItemDTO) {
        orderItemService.addOrderItem(orderItemDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteOrderItem(@PathVariable int id) {
        orderItemService.deleteOrderItem(id);
    }
}
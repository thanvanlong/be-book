package com.longtv.btlon1.service.order;

import com.longtv.btlon1.entity.order.Order;

import java.util.List;

public interface OrderService {
    boolean save(Order order);
    List<Order> getOrderByUserIdAndStatus(String id, int status);

    List<Order> getAll();
    List<Order> getByUserId(String id);

    void update(String id, int status);

    Order getOneOrderById(String id);
}

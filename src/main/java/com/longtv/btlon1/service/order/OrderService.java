package com.longtv.btlon1.service.order;

import com.longtv.btlon1.entity.order.Order;

import java.util.List;

public interface OrderService {
    boolean save(Order order);
    List<Order> getOrderByUserIdAndStatus(long id, int status);

    List<Order> getAll();
    List<Order> getByUserId(long id);

    void update(long id, int status);
}

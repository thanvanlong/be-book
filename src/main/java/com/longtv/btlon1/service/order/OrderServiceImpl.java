package com.longtv.btlon1.service.order;

import com.longtv.btlon1.entity.order.Order;
import com.longtv.btlon1.repo.order.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderRepo orderRepo;
    @Override
    public boolean save(Order order) {
        try {
            orderRepo.save(order);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Order> getOrderByUserIdAndStatus(long id, int status) {
        return orderRepo.findByUserIdAndAndStatus(id, status);
    }

    @Override
    public List<Order> getAll() {
        return orderRepo.findAllByOrderByCreatedAtDesc();
    }

    @Override
    public List<Order> getByUserId(long id) {
        return orderRepo.findByUserId(id);
    }

    @Override
    public void update(long id, int status) {
        Order order = orderRepo.findById(id);
        order.setStatus(status);
        orderRepo.save(order);
    }

    @Override
    public Order getOneOrderById(long id) {
        Order order = orderRepo.findById(id);
        return order;
    }
}

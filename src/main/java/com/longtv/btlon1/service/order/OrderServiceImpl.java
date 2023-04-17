package com.longtv.btlon1.service.order;

import com.longtv.btlon1.entity.order.Order;
import com.longtv.btlon1.repo.order.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public List<Order> getOrderByUserIdAndStatus(String id, int status) {
        return orderRepo.findByUserIdAndAndStatus(id, status);
    }

    @Override
    public List<Order> getAll() {
        return orderRepo.findAllByOrderByCreatedAtDesc();
    }

    @Override
    public List<Order> getByUserId(String id) {
        return orderRepo.findByUserId(id);
    }

    @Override
    public void update(String id, int status) {
        Order order = orderRepo.findById(id).get();
        order.setStatus(status);
        orderRepo.save(order);
    }

    @Override
    public Order getOneOrderById(String id) {
        Optional<Order> order = orderRepo.findById(id);
        return order.get();
    }
}

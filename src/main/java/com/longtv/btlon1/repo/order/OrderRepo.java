package com.longtv.btlon1.repo.order;

import com.longtv.btlon1.entity.order.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepo extends MongoRepository<Order, String> {
    List<Order> findByUserIdAndAndStatus(String id, long status);
    List<Order> findByUserId(String id);

    List<Order> findAllByOrderByCreatedAtDesc();

    Optional<Order> findById(String id);

}

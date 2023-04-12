package com.longtv.btlon1.repo.order;

import com.longtv.btlon1.entity.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepo extends JpaRepository<Order, Long> {
    List<Order> findByUserIdAndAndStatus(long id, long status);
    List<Order> findByUserId(long id);

    Order findById(long id);

}

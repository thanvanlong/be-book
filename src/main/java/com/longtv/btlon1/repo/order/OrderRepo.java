package com.longtv.btlon1.repo.order;

import com.longtv.btlon1.entity.order.Order;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepo extends JpaRepository<Order, Long> {
    List<Order> findByUserIdAndAndStatus(long id, long status);
    List<Order> findByUserId(long id);

    List<Order> findAllByOrderByCreatedAtDesc();

    Order findById(long id);

}

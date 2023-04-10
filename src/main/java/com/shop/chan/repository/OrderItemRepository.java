package com.shop.chan.repository;

import com.shop.chan.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

    List<OrderItem> findOrderItemsByMemberId(Long memberId);
    OrderItem findOrderItemsById(Long orderItemId);
}

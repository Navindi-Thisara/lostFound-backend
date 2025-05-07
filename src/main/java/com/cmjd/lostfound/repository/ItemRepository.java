package com.cmjd.lostfound.repository;

import com.cmjd.lostfound.model.Item;
import com.cmjd.lostfound.model.ItemStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByStatus(ItemStatus status);
}

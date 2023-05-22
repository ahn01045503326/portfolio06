package ahn.sungsin.shop.repository;

import ahn.sungsin.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
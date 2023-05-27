package ahn.sungsin.shop.repository;

import ahn.sungsin.shop.dto.ItemSearchDto;
import ahn.sungsin.shop.dto.MainItemDto;
import ahn.sungsin.shop.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {

    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

}
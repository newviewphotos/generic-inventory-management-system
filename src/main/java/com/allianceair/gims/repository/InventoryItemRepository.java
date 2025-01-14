package com.allianceair.gims.repository;

import com.allianceair.gims.model.InventoryItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface InventoryItemRepository extends MongoRepository<InventoryItem, String> {
    List<InventoryItem> findByNameStartsWith(String name);
    List<InventoryItem> findByCategoryStartsWith(String category);
    List<InventoryItem> findByTypeStartsWith(String type);
    List<InventoryItem> findByBrandStartsWith(String brand);

    @Query("{ $and : [ { name: '#name' } , { category : '#category' } ] }")
    List<InventoryItem> findAllByNameAndCategory(@Param("name") String name, @Param("category") String category);
}

package com.allianceair.gims.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collection = "items")
public class InventoryItem {

    @Id private String id;
    private String name;
    private String category;
    private String type;
    private String brand;
    private String description;
    private String imageUrl;
    private List<ServiceOrder> serviceOrders;
}

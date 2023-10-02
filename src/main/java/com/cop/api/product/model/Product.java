package com.cop.api.product.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "product_sequence")
    @SequenceGenerator(name = "product_sequence",
            sequenceName = "product_sequence_id", allocationSize = 1)
    Long id;
    String productId;
    String title;
    String brand;
    String description;
    String partnumber;
    String sizeGuide;
    String warrantyInformation;
    String deliveryMessage;
    String submissionTime;

}


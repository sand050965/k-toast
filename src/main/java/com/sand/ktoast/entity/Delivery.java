package com.sand.ktoast.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "delivery_details")
public class DeliveryDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String country;

    @NotNull
    private String city;

    @NotNull
    private String district;

    @NotNull
    private String address;

    @NotNull
    private int arrivalTimeSlot;

    @NotNull
    private int paymentMethod;
}

package com.star.productservicenov.models;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@MappedSuperclass // No table created, representing relationship
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
    private Long id;
    private Long createdAt;
    private Long updatedAt;
}

package com.gcu.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.gcu.data.entity.ProductEntity;

public interface ProductsRepository extends CrudRepository<ProductEntity,Long> {
}

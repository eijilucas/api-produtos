package com.eijilucas.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eijilucas.product.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

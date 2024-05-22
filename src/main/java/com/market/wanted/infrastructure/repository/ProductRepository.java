package com.market.wanted.infrastructure.repository;

import com.market.wanted.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

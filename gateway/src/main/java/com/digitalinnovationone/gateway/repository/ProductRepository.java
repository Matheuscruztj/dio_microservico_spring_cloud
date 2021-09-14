package com.digitalinnovationone.gateway.repository;

import com.digitalinnovationone.gateway.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}

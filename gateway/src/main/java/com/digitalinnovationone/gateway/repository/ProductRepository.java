package com.digitalinnovationone.gateway.repository;

import com.digitalinnovationone.gateway.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}

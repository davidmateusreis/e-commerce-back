package com.david.backend.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.david.backend.entity.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {

    List<Product> findAll(Pageable pageable);

    List<Product> findByProductNameContainingIgnoreCaseOrProductDescriptionContainingIgnoreCase(String key1,
            String key2,
            Pageable pageable);

}

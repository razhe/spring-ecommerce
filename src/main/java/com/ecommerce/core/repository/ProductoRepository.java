package com.ecommerce.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.core.model.Producto;

// @Repository innecesario porque jpa ya tiene una sub clase "simpleRepository" que tiene la anotacion
public interface ProductoRepository extends JpaRepository<Producto, Long>{
}

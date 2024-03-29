package dmacc.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.Product;

/**
 * @author aidan - agdavidson
 * CIS175 - Spring 2024
 * Mar 28, 2024
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}

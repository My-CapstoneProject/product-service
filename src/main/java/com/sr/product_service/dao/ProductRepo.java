package com.sr.product_service.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sr.product_service.entity.ProductEntity;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity,Integer>{


//	List<ProductEntity> findByUserId(int userId);

}

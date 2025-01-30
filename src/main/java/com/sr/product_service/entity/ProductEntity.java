package com.sr.product_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="product_details")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	public int productId;
	
	@Column(name="product_name")
	public String productName;
	
	@Column(name="product_price")
	public int productPrice;
	
	@Column(name="product_brand")
	public String productBrand;
	
	@Column(name = "product_category")
	public String productCategory;
	
	@Column(name="product_user_id")
	public int productUserId;
	
	@Column(name="product_image_url")
	public String productImageUrl;
	
}

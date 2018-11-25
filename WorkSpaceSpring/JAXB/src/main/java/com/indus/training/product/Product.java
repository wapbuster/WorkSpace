package com.indus.training.product;

import javax.xml.bind.annotation.*;

import com.indus.training.product.Owner;


@XmlRootElement(name = "product")
//@XmlAccessorType(XmlAccessType.FIELD)
public class Product {
	@XmlAttribute(name = "id")
	private String productId;
	@XmlElement(name = "price")
	private int price;
	@XmlElement(name = "owner")
	private Owner owner;

	public Product() {
	}

	public Product(String productId, int price, Owner owner) {
		this.productId = productId;
		this.price = price;
		this.owner = owner;

	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", price=" + price + ", owner=" + owner + "]";
	}

	
	
}

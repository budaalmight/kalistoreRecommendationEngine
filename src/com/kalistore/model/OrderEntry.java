package com.kalistore.model;

import java.io.Serializable;


/**
 * Created by kanch on 12/28/2016.
 */

public class OrderEntry implements Serializable
{
	private int orderId;
	private Product product;
	private int quantity;

	public int getOrderId()
	{
		return orderId;
	}

	public void setOrderId(int orderId)
	{
		this.orderId = orderId;
	}

	public Product getProduct()
	{
		return product;
	}

	public void setProduct(Product product)
	{
		this.product = product;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
}

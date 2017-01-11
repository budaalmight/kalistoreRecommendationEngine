package com.kalistore.model;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.List;


/**
 * Created by kanch on 12/27/2016.
 */

public class Order implements Serializable
{
	private int orderId;
	private Delivery delivery;
	private double totalPrice;
	private User user;
	private int status;
	private List<OrderEntry> entries;


	public int getOrderId()
	{
		return orderId;
	}

	public void setOrderId(int orderId)
	{
		this.orderId = orderId;
	}

	public Delivery getDelivery()
	{
		return delivery;
	}

	public void setDelivery(Delivery delivery)
	{
		this.delivery = delivery;
	}

	public double getTotalPrice()
	{
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice)
	{
		this.totalPrice = totalPrice;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	public int getStatus()
	{
		return status;
	}

	public void setStatus(int status)
	{
		this.status = status;
	}

	@XmlElement(name = "products")
	public List<OrderEntry> getEntries()
	{
		return entries;
	}

	public void setEntries(List<OrderEntry> entries)
	{
		this.entries = entries;
	}
}

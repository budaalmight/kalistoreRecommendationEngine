package com.kalistore.model;

import java.io.Serializable;
import java.util.List;


/**
 * Created by kanch on 12/9/2016.
 */

public class User implements Serializable
{
	private int userId;
	private String username;
	private String password;
	private String fullName;
	private String email;
	private String phone;
	private List<Order> orders;
	private List<Address> addresses;
	private Address mainAddress;


	public int getUserId()
	{
		return userId;
	}

	public void setUserId(int userId)
	{
		this.userId = userId;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getFullName()
	{
		return fullName;
	}

	public void setFullName(String fullName)
	{
		this.fullName = fullName;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public List<Order> getOrders()
	{
		return orders;
	}

	public void setOrders(List<Order> orders)
	{
		this.orders = orders;
	}

	public List<Address> getAddresses()
	{
		return addresses;
	}

	public void setAddresses(List<Address> addresses)
	{
		this.addresses = addresses;
	}

	public Address getMainAddress()
	{
		return mainAddress;
	}

	public void setMainAddress(Address mainAddress)
	{
		this.mainAddress = mainAddress;
	}
}

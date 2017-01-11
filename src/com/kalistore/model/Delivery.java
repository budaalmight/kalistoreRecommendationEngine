package com.kalistore.model;

import java.io.Serializable;


/**
 * Created by kanch on 12/27/2016.
 */

public class Delivery implements Serializable
{
	private int deliveryId;
	private Address address;
	private Client client;
	private int isToOffice;
	private int officeId;
	private int differentAddress;


	public int getDeliveryId()
	{
		return deliveryId;
	}

	public void setDeliveryId(int deliveryId)
	{
		this.deliveryId = deliveryId;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	public Client getClient()
	{
		return client;
	}

	public void setClient(Client client)
	{
		this.client = client;
	}

	public int getIsToOffice()
	{
		return isToOffice;
	}

	public void setIsToOffice(int isToOffice)
	{
		this.isToOffice = isToOffice;
	}

	public int getOfficeId()
	{
		return officeId;
	}

	public void setOfficeId(int officeId)
	{
		this.officeId = officeId;
	}

	public int getDifferentAddress()
	{
		return differentAddress;
	}

	public void setDifferentAddress(int differentAddress)
	{
		this.differentAddress = differentAddress;
	}
}

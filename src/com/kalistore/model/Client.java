package com.kalistore.model;

import java.io.Serializable;


/**
 * Created by kanch on 12/27/2016.
 */

public class Client implements Serializable
{
	private int clientId;
	private String fullName;
	private String phone;


	public int getClientId()
	{
		return clientId;
	}

	public void setClientId(int clientId)
	{
		this.clientId = clientId;
	}

	public String getFullName()
	{
		return fullName;
	}

	public void setFullName(String fullName)
	{
		this.fullName = fullName;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}
}

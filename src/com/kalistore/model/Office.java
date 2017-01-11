package com.kalistore.model;

import java.io.Serializable;


/**
 * Created by kanch on 12/27/2016.
 */

public class Office implements Serializable
{
	private int officeId;
	private String name;
	private City city;


	public int getOfficeId()
	{
		return officeId;
	}

	public void setOfficeId(int officeId)
	{
		this.officeId = officeId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public City getCity()
	{
		return city;
	}

	public void setCity(City city)
	{
		this.city = city;
	}
}

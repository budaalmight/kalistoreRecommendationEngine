package com.kalistore.model;

import java.io.Serializable;


/**
 * Created by kanch on 12/27/2016.
 */

public class City implements Serializable
{
	private int cityId;
	private String name;


	public int getCityId()
	{
		return cityId;
	}

	public void setCityId(int cityId)
	{
		this.cityId = cityId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}

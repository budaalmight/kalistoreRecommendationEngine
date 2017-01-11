package com.kalistore.model;

import java.io.Serializable;


/**
 * Created by kanch on 12/12/2016.
 */

public class Material implements Serializable
{
	private int materialId;
	private String name;


	public int getMaterialId()
	{
		return materialId;
	}

	public void setMaterialId(int materialId)
	{
		this.materialId = materialId;
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

package com.kalistore.model;

import java.io.Serializable;


/**
 * Created by kanch on 12/12/2016.
 */

public class Category implements Serializable
{
	private int categoryId;
	private String name;
	//    private List<com.kalistore.model.Product> products;


	public int getCategoryId()
	{
		return categoryId;
	}

	public void setCategoryId(int categoryId)
	{
		this.categoryId = categoryId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	//    public List<com.kalistore.model.Product> getProducts() {
	//        return products;
	//    }
	//
	//    public void setProducts(List<com.kalistore.model.Product> products) {
	//        this.products = products;
	//    }


	@Override
	public int hashCode()
	{
		int hash = 9;
		hash = 17 * hash + (this.categoryId != 0 ? this.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object obj)
	{
		boolean val = false;

		if (obj instanceof Category)
		{
			val = this.getCategoryId() == ((Category) obj).getCategoryId();
		}

		return val;
	}
}

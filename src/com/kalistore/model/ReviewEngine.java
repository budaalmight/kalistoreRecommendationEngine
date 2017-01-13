package com.kalistore.model;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class ReviewEngine
{
	public List<Product> getProductsByRatings(List<Product> allProducts)
	{
		return allProducts.stream().sorted(Comparator.comparing(Product::getRating).reversed()).collect(Collectors.toList());
	}
}

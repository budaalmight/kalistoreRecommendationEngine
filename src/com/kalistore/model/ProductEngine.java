package com.kalistore.model;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ProductEngine
{
	public List<Product> suggestAlternatives(List<Product> allProducts, Product s) throws RemoteException, NotBoundException
	{
		List<Category> categories = s.getCategories();
		Map<Product, Integer> categoryMatches = new HashMap<>();
		for (Product product : allProducts)
		{
			for (Category category : product.getCategories())
			{
				if (categories.contains(category))
				{
					if (categoryMatches.containsKey(product))
					{
						Integer integer = categoryMatches.get(product);
						integer += 1;
						categoryMatches.put(product, integer);
					}
					else
					{
						categoryMatches.put(product, 1);
					}
				}
			}
		}
		List<Product> collect = categoryMatches.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
				.map(Map.Entry::getKey).collect(Collectors.toList());
		collect.remove(0);
		return collect;
	}
}

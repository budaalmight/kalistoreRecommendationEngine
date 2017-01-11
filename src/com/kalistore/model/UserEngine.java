package com.kalistore.model;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class UserEngine
{

	public List<Product> suggestProductsForUser(List<Order> ordersByUser) throws RemoteException, NotBoundException
	{
		Map<Product, Integer> suggestions = new HashMap<>();
		for (Order order : ordersByUser)
		{
			for (OrderEntry entry : order.getEntries())
			{
				Product product = entry.getProduct();
				if (suggestions.containsKey(product))
				{
					Integer count = suggestions.get(product) + 1;
					suggestions.put(product, count);
				}
				else
				{
					suggestions.put(product, 1);
				}
			}
		}
		List<Product> collect = suggestions.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
				.map(Map.Entry::getKey).collect(
						Collectors.toList());
		return collect;
	}
}

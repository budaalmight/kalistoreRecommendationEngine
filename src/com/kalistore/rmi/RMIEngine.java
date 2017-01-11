package com.kalistore.rmi;

import com.kalistore.model.*;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;


public class RMIEngine implements Stub
{

	@Override
	public List<Product> getSuggestionsForProduct(List<Product> allProducts, Product product)
			throws RemoteException, NotBoundException
	{
		ProductEngine engine = new ProductEngine();
		return engine.suggestAlternatives(allProducts, product);
	}

	@Override
	public List<Product> getSuggestionsForUser(List<Order> allOrders) throws RemoteException, NotBoundException
	{
		UserEngine userEngine = new UserEngine();
		return userEngine.suggestProductsForUser(allOrders);
	}

	@Override
	public List<Product> getSuggestionsByRating(List<Product> allProducts) throws RemoteException, NotBoundException
	{
		ReviewEngine engine = new ReviewEngine();
		return engine.getProductsByRatings(allProducts);
	}

	public static void main(String[] args)
	{

		try
		{
			RMIEngine engine = new RMIEngine();
			Stub stub = (Stub) UnicastRemoteObject.exportObject(engine, 0);

			// Bind the remote object's stub in the registry
			Registry registry = LocateRegistry.createRegistry(8123);
			registry.bind("RecommendationEngine", stub);

			System.err.println("Server ready");
			while (true)
			{

			}
		}
		catch (Exception e)
		{
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}
}

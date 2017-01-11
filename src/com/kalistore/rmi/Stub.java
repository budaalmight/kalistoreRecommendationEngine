package com.kalistore.rmi;

import com.kalistore.model.Order;
import com.kalistore.model.Product;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;



public interface Stub extends Remote
{
	List<Product> getSuggestionsForProduct(List<Product> allProducts, Product product) throws RemoteException, NotBoundException;

	List<Product> getSuggestionsForUser(List<Order> allOrders) throws RemoteException, NotBoundException;

	List<Product> getSuggestionsByRating(List<Product> allProducts) throws RemoteException, NotBoundException;
}

package com.forkexec.rst.ws;

import java.nio.charset.Charset;
import java.util.Random;

import com.forkexec.rst.domain.Menu;

public class MenuOrder {
	private String order;
	private Menu menuOrder;
	private int quantity;
	private double cost;

	public MenuOrder(Menu order, int quantity, double cost) {
		this.menuOrder = order;
		this.quantity = quantity;
		this.cost = cost;
	}

	public String getOrder() {
		byte[] array = new byte[7]; // length is bounded by 7
	    new Random().nextBytes(array);
	    String orderId = new String(array, Charset.forName("UTF-8"));
		return orderId;
	}

	public Menu getMenu() {
		return menuOrder;
	}
	
	public double getCost() {
		return cost;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Menu Order [orderId=").append(order);
		builder.append(", menu=").append(menuOrder);
		builder.append(", custo=").append(cost);
		builder.append(", quantidade=").append(quantity);
		builder.append("]");
		return builder.toString();
	}

}

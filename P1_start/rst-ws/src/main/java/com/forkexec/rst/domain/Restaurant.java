package com.forkexec.rst.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Restaurant
 *
 * A restaurant server.
 *
 */
public class Restaurant {


	private List<Menu> list = new ArrayList<>();

	// Singleton -------------------------------------------------------------

	/** Private constructor prevents instantiation from other classes. */
	private Restaurant() {
	}

	/**
	 * SingletonHolder is loaded on the first execution of Singleton.getInstance()
	 * or the first access to SingletonHolder.INSTANCE, not before.
	 */
	private static class SingletonHolder {
		private static final Restaurant INSTANCE = new Restaurant();
	}

	public static synchronized Restaurant getInstance() {
		return SingletonHolder.INSTANCE;
	}

	public void addMenu(String mid, String description, Meal entrada, Meal pratoPrincipal, Meal sobremesa, int quantity) {
		Menu m = new Menu(mid, description, entrada, pratoPrincipal, sobremesa, quantity);
		this.list.add(m);
		
	}
	public Menu getMenu(String menuId) {
		for (Menu m : list)
			if(m.getMenu() == menuId) {
				return m;
			}
		return null;
	}	
	
	public double getMenuCost(String menuId)  {
		double cost = 0;
		for (Menu m : list)
		if(m.getMenu() == menuId) {
			cost = m.getCost();
		}
		return cost;
	}	
	
}

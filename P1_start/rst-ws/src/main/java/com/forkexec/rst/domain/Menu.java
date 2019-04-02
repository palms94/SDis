package com.forkexec.rst.domain;

public class Menu {
	private String menuId;
	private String description;
	private Meal entrada;
	private Meal pratoPrincipal;
	private Meal sobremesa;
	private double cost;
	private int quantity;

	public Menu(String mid, String description, Meal entrada, Meal pratoPrincipal, Meal sobremesa, int quantity) {
		this.menuId = mid;
		this.description = description;
		this.entrada = entrada;
		this.pratoPrincipal = pratoPrincipal;
		this.sobremesa = sobremesa;
		this.cost = entrada.getCost() + pratoPrincipal.getCost() + sobremesa.getCost();
		this.quantity = quantity;
	}

	public String getMenu() {
		return menuId;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Meal getEntrada() {
		return entrada;
	}
	
	public Meal getPratoPrincipal() {
		return pratoPrincipal;
	}
	
	public Meal getSobremesa() {
		return sobremesa;
	}
	
	public double getCost() {
		return cost;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void changeQuantity(int quant) {
		quantity = quantity - quant;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Menu [menuId=").append(menuId);
		builder.append(", description=").append(description);
		builder.append(", entrada=").append(entrada);
		builder.append(", prato principal=").append(pratoPrincipal);
		builder.append(", sobremesa=").append(sobremesa);
		builder.append(", custo=").append(cost);
		builder.append(", quantidade=").append(quantity);
		builder.append("]");
		return builder.toString();
	}

}
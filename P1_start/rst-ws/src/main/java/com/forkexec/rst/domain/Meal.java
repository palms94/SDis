package com.forkexec.rst.domain;

public class Meal {
	private String type;
	private String description;
	private double cost;

	public Meal(String type, String description, double cost) {
		this.type = type;
		this.description = description;
		this.cost = cost;
	}

	public String getType() {
		return type;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getCost() {
		return cost;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Meal [Type=").append(type);
		builder.append(", description=").append(description);
		builder.append(", cost=").append(cost);
		builder.append("]");
		return builder.toString();
	}

}


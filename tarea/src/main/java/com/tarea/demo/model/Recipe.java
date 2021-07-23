package com.tarea.demo.model;

public class Recipe {
	private String name;
    private int price;
    private int coffe;
    private int chocolate;
    private int milk;
    private int sugar;

    public Recipe(String name, int price, int coffe, int chocolate, int milk, int sugar){
        this.name=name;
        this.price=price;
        this.coffe=coffe;
        this.chocolate=chocolate;
        this.milk=milk;
        this.sugar=sugar;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCoffe() {
		return coffe;
	}

	public void setCoffe(int coffe) {
		this.coffe = coffe;
	}

	public int getChocolate() {
		return chocolate;
	}

	public void setChocolate(int chocolate) {
		this.chocolate = chocolate;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
}

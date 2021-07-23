package com.tarea.demo.model;

public class Inventory {
	private int coffe;
    private int milk;
    private int chocolate;
    private int sugar;

    public Inventory(int coffe, int milk, int chocolate, int sugar){
        this.coffe=coffe;
        this.milk=milk;
        this.chocolate=chocolate;
        this.sugar=sugar;
    }

	public int getCoffe() {
		return coffe;
	}

	public void setCoffe(int coffe) {
		this.coffe = coffe;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	public int getChocolate() {
		return chocolate;
	}

	public void setChocolate(int chocolate) {
		this.chocolate = chocolate;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	//Agregar materia prima al inventario
	public void addInventory(int coffe, int milk, int chocolate, int sugar){
		this.coffe = this.coffe + coffe;
		this.milk = this.milk + milk;
		this.chocolate = this.chocolate + chocolate;
		this.sugar = this.sugar + sugar;
	}
	//Utiliza materia prima
	public void subInventory(int coffe, int milk, int chocolate, int sugar) {
		this.coffe = this.coffe - coffe;
		this.milk = this.milk - milk;
		this.chocolate = this.chocolate - chocolate;
		this.sugar = this.sugar - sugar;
	}
	//Mostrar lo que posee el inventario
	@Override 
	public String toString() {
		String str = "Unidades de cafe: "+String.valueOf(this.coffe)+"\n"+"Unidades de leche: "+String.valueOf(this.milk)+"\n"+"Unidades de chocolate: "+ String.valueOf(this.chocolate)+"\n"+"Unidades de azucar: "+String.valueOf(this.sugar);
	    return str;
	}
    
}

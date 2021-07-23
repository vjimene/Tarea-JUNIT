package com.tarea.demo.model;

import org.apache.log4j.Logger;

public class CoffeMachine {
	private Inventory inventory;
    private Recipe recipeOne;
    private Recipe recipeTwo;
    private Recipe recipeThree;

    public CoffeMachine(Inventory inventory, Recipe recipeOne, Recipe recipeTwo, Recipe recipeThree){
        this.inventory=inventory;
        this.recipeOne=recipeOne;
        this.recipeTwo=recipeTwo;
        this.recipeThree=recipeThree;
    }

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Recipe getRecipeOne() {
		return recipeOne;
	}

	public void setRecipeOne(Recipe recipeOne) {
		this.recipeOne = recipeOne;
	}

	public Recipe getRecipeTwo() {
		return recipeTwo;
	}

	public void setRecipeTwo(Recipe recipeTwo) {
		this.recipeTwo = recipeTwo;
	}

	public Recipe getRecipeThree() {
		return recipeThree;
	}

	public void setRecipeThree(Recipe recipeThree) {
		this.recipeThree = recipeThree;
	}
	//Calcula el cambio 
	public static int changeCoins(int pay, int price){
    	return pay-price;
    }
	//vende bebidas, true indica que la bebida se vendio. False indica que no se pudo vender
	public boolean sellDrink(int pay, Recipe recipe, Inventory inventory){
		Logger log = Logger.getLogger("Log de tarea");
		//verifica si el pago alcanza
		if(pay < recipe.getPrice()) {
			log.info("El pago es insuficiente");
			return false;
		}
		//verifica si alcanzan el inventario
		if(recipe.getCoffe() > inventory.getCoffe()) {
			log.info("No hay suficientes unidades de café");
			return false;
		}
		if(recipe.getMilk() > inventory.getMilk()) {
			log.info("No hay suficientes unidades de leche");
			return false;
		}
		if(recipe.getChocolate() > inventory.getChocolate()) {
			log.info("No hay suficientes unidades de chocolate");
			return false;
		}
		if(recipe.getSugar() > inventory.getSugar()) {
			log.info("No hay suficientes unidades de azucar");
			return false;
		}
		//llegado a este punto la bebida puede venderse y se descuentan las materias primas
		inventory.subInventory(recipe.getCoffe(), recipe.getMilk(), recipe.getChocolate(), recipe.getSugar());
		return true;
	}
	
}

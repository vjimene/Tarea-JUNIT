package com.tarea.demo;
import com.tarea.demo.model.Recipe;
import com.tarea.demo.model.Inventory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tarea.demo.model.CoffeMachine;

public class UnitTest {

	Inventory testInventory = new Inventory(20, 20, 0, 20);
	Recipe testRec1 = new Recipe("Cafe americano", 200, 5, 0, 0, 0);
	Recipe testRec2 = new Recipe("Chocolate caliente", 250, 0, 5, 5, 0);
	Recipe testRec3 = new Recipe("Cafe con leche", 250, 3, 0, 3, 2);
	CoffeMachine testCoffeMachine = new CoffeMachine(testInventory, testRec1, testRec2, testRec3);
	
	@Test
	public void testSellMoney(){
		//sin dinero suficiente
		assertEquals(false, testCoffeMachine.sellDrink(100, testRec1, testInventory));
	}
	@Test
	public void testSellInventory() {
		//sin materia prima
		assertEquals(false, testCoffeMachine.sellDrink(300, testRec2, testInventory));

	}
	@Test
	public void testSellOk() {
		//Con materia prima y dinero
		assertEquals(true, testCoffeMachine.sellDrink(300, testRec3, testInventory));
	}
	@Test
	public void testSellChange() {
		//Vuelto
		assertEquals(100, CoffeMachine.changeCoins(300, testRec1.getPrice()));
	}
	//Reducir materia primaria 
	@Test
	public void testSellSubCoffe() {
		testCoffeMachine.sellDrink(300, testRec3, testInventory);
		assertEquals(17, testInventory.getCoffe());
	}
	@Test
	public void testSellSubChocolate() {
		testCoffeMachine.sellDrink(300, testRec3, testInventory);
		assertEquals(0, testInventory.getChocolate());
	}
	@Test
	public void testSellSubMilk() {
		testCoffeMachine.sellDrink(300, testRec3, testInventory);
		assertEquals(17, testInventory.getMilk());
	}
	@Test
	public void testSellSubSugar() {
		testCoffeMachine.sellDrink(300, testRec3, testInventory);
		assertEquals(18, testInventory.getSugar());
	}

	public void testAddCoffe(){
		testCoffeMachine.getInventory().addInventory(1, 0, 0, 0);
		assertEquals(21,testCoffeMachine.getInventory().getCoffe());
	}
	public void testAddMilk() {
		testCoffeMachine.getInventory().addInventory(0, 1, 0, 0);
		assertEquals(21,testCoffeMachine.getInventory().getMilk());
	}
	public void testAddChoco() {
		testCoffeMachine.getInventory().addInventory(0, 0, 1, 0);
		assertEquals(1,testCoffeMachine.getInventory().getChocolate());
	}
	public void testAddSugar() {
		testCoffeMachine.getInventory().addInventory(0, 0, 0, 1);
		assertEquals(21,testCoffeMachine.getInventory().getSugar());
	}
}



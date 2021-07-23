package com.tarea.demo.emu;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.tarea.demo.model.CoffeMachine;
import com.tarea.demo.model.Inventory;
import com.tarea.demo.model.Recipe;

public class CoffeMachineEmulator {
	final static Logger logger = Logger.getLogger(CoffeMachineEmulator.class);
	public static void main(String[] args) {
        System.out.println("Bienvenido a la simulacion de su maquina de cafe");
        System.out.println("Ingrese 3 recetas de cafe");
        Scanner scanner = new Scanner(System.in);
        //Recetas de cafe
        System.out.println("Primera receta");
        Recipe recOne = writeRecipe();
        logger.info("El usuario incluyó la primera receta");
        
        System.out.println("Segunda receta"); 
        Recipe recTwo = writeRecipe();
        logger.info("El usuario incluyó la segunda receta");
        
        System.out.println("Tercera receta"); 
        Recipe recThr = writeRecipe();
        logger.info("El usuario incluyó la tercera receta");
    
        Inventory inv = new Inventory(0, 0, 0, 0);
        CoffeMachine emu = new CoffeMachine(inv, recOne, recTwo, recThr);
        while(true) {
        	System.out.println("Máquina en espera...");
        	System.out.println("Acciones");
        	System.out.println("[1] Agregar inventario");
        	System.out.println("[2] Verificar inventario");
        	System.out.println("[3] Comprar bebida");
        	System.out.println("Seleccione una...");
        	int eleccion = scanner.nextInt();
        	
        	switch(eleccion) {
        	case 1:
        		logger.info("El usuario seleccionó Agregar inventario");
        		add(emu);
        		break;
        	case 2:
        		logger.info("El usuario seleccionó Verificar inventario");
        		System.out.println(emu.getInventory().toString());
        		break;
        	case 3:
        		logger.info("El usuario seleccionó realizar una compra");
        		System.out.println("Seleccione una receta de café");
        		System.out.println("[1] " + emu.getRecipeOne().getName() + " precio: " + String.valueOf(emu.getRecipeOne().getPrice()));
        		System.out.println("[2] " + emu.getRecipeTwo().getName() + " precio: " + String.valueOf(emu.getRecipeTwo().getPrice()));
        		System.out.println("[3] " + emu.getRecipeThree().getName() + " precio: " + String.valueOf(emu.getRecipeThree().getPrice()));
            	int coffeRecipe = scanner.nextInt();
            	System.out.print("ingrese el dinero: ");
            	int price = scanner.nextInt();
            	
            	switch(coffeRecipe) {
            	case 1:
            		logger.info("El usuario seleccionó "+ emu.getRecipeOne().getName());
            		if(emu.sellDrink(price,emu.getRecipeOne(), emu.getInventory())) {
            			System.out.println("Exito en la compra, el vuelto es: "+ String.valueOf(CoffeMachine.changeCoins(emu.getRecipeOne().getPrice(), price)));
            		}else {
            			System.out.println("Lo siento, no se ha podido completar la compra " + String.valueOf(price));
            		}
            		break;
            	case 2:
            		logger.info("El usuario seleccionó "+ emu.getRecipeTwo().getName());
            		if(emu.sellDrink(price,emu.getRecipeTwo(), emu.getInventory())) {
            			System.out.println("Exito en la compra, el vuelto es: "+ String.valueOf(CoffeMachine.changeCoins(emu.getRecipeTwo().getPrice(), price)));
            		}else {
            			System.out.println("Lo siento, no se ha podido completar la compra " + String.valueOf(price));
            		}
            		break;
            	case 3:
            		logger.info("El usuario seleccionó "+ emu.getRecipeThree().getName());
            		if(emu.sellDrink(price,emu.getRecipeThree(), emu.getInventory())) {
            			System.out.println("Exito en la compra, el vuelto es: "+ String.valueOf(CoffeMachine.changeCoins(emu.getRecipeThree().getPrice(), price)));
            		}else {
            			System.out.println("Lo siento, no se ha podido completar la compra " + String.valueOf(price));
            		}
            		break;
            	default:
            		System.out.println("Seleccion invalida");
            		logger.info("El usuario seleccionó un valor invalido");
            		break;
            	}
            	
        		break;
        	default:
        		System.out.println("Seleccion invalida");
        		logger.info("El usuario seleccionó un valor invalido");
        		break;
        	}
        }
    } 
    //Recibe las recetas antes de iniciar la simulación
    public static Recipe writeRecipe(){
    	Scanner scanner = new Scanner(System.in);
        System.out.print("nombre de receta: ");
        String name = scanner.nextLine();
        System.out.print("precio: ");
        int price = scanner.nextInt();
        System.out.print("unidades de cafe: ");
        int coffe = scanner.nextInt();
        while (coffe > 10) {
            System.out.println("Sobrepasa el valor máximo, por favor ingrese una cantidad 10 o menor");
            coffe = scanner.nextInt();  
        }
        System.out.print("unidades de chocolate: ");
        int choco = scanner.nextInt();
        while (choco > 10) {
        	logger.info("El usuario sobrepasó la cantidad máxima");
            System.out.println("Sobrepasa el valor máximo, por favor ingrese una cantidad 10 o menor");
            choco = scanner.nextInt();  
        }
        System.out.print("unidades de leche: ");
        int milk = scanner.nextInt();
        while (milk > 80) {
        	logger.info("El usuario sobrepasó la cantidad máxima");
            System.out.println("Sobrepasa el valor máximo, por favor ingrese una cantidad 80 o menor");
            milk = scanner.nextInt();  
        }
        System.out.print("unidades de azucar: ");
        int sugar = scanner.nextInt();
        while (sugar > 40) {
        	logger.info("El usuario sobrepasó la cantidad máxima");
            System.out.println("Sobrepasa el valor máximo, por favor ingrese una cantidad 40 o menor");
            sugar = scanner.nextInt();  
        }
        return new Recipe(name, price, coffe, choco, milk, sugar); 
    }
    public static void add(CoffeMachine emu) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Unidades de cafe");
    	int coffe = scanner.nextInt();
    	System.out.print("unidades de chocolate: ");
    	int choco = scanner.nextInt();
    	System.out.print("unidades de leche: ");
    	int milk = scanner.nextInt();
    	System.out.print("unidades de azucar: ");
    	int sugar = scanner.nextInt();
    	emu.getInventory().addInventory(coffe, milk, choco, sugar);
    }
}

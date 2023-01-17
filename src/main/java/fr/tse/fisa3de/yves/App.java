package fr.tse.fisa3de.yves;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;

/**
 * Instantiate a fridge, initialize stuff, show something, WIP
 * @author Alexis LAFONT
 */
public class App {
	public static void main(String[] args) {
		
		// Create stuff
		Fridge theFridge = new Fridge();
		String l_foodName = "yaourt";
		Foodstuff l_tempFood = new Foodstuff(l_foodName);
		theFridge.addFoodstuff(l_tempFood);
		
		// Add second 
		l_foodName = "tupperware rempli du reste de chilicon carné d'hier";
		Foodstuff l_tempFood2 = new Foodstuff(l_foodName);
		theFridge.addFoodstuff(l_tempFood2);
		
		// Display
		List<Foodstuff> l_foodList = theFridge.getAllFoodstuff();
		for (Foodstuff foodstuff : l_foodList) {
			System.out.println(foodstuff.getName() + " ");
		}
	}
}

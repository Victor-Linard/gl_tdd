package fr.tse.fisa3de.yves;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Smart fridge abstraction. It allows to keep records of foodstuff inside.
 * @see Foodstuff
 * @author Alexis LAFONT
 */
public class Fridge {
	
	// Constructor
	public Fridge() {
		m_inventory = new ArrayList<Foodstuff>();
	}
	
	/**
	 * Getter to retrieve all foodstuff
	 * @return A list of foodstuff
	 */
	public List<Foodstuff> getAllFoodstuff()
	{
		return m_inventory;
	}

	/**
	 * Add something into the fridge inventory
	 * @param p_Food The food to add
	 */
	public void addFoodstuff(Foodstuff p_Food) {
		m_inventory.add(p_Food);
	}

	/**
	 * Remove something into the fridge inventory
	 * @param p_foodToRemove The food to remove
	 */
	boolean removeFoodstuff(Foodstuff p_foodToRemove) {
		boolean found = false;
		Iterator<Foodstuff> i = this.m_inventory.iterator();
		while (i.hasNext()) {
			Foodstuff f = i.next();
			if (f == p_foodToRemove) {
				i.remove();
				return true;
			}
		}
		return found;
	}

	/**
	 * Describes the foodstuff contained inside the fridge as a list
	 */
	private final List<Foodstuff> m_inventory;
}

package fr.tse.fisa3de.yves;

import java.util.ArrayList;
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
	 * @param l_tempFood The food to add
	 */
	public void addFoodstuff(Foodstuff p_Food) {
		m_inventory.add(p_Food);
	}

	/**
	 * Describes the foodstuff contained inside the fridge as a list
	 */
	private List<Foodstuff> m_inventory;
}

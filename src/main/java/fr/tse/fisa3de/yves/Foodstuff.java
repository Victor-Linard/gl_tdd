package fr.tse.fisa3de.yves;

import java.lang.String;

/**
 * Abstraction of something usual to be put inside a fridge
 * Can also be added to a freezer
 * @see Fridge
 * @author Alexis LAFONT
 */
public class Foodstuff {

	public Foodstuff(String p_name) {
		m_name = p_name;
	}
	
	/**
	 * Getter to retrieve all foodstuff
	 * @return A list of foodstuff
	 */
	public String getName() {
		return m_name;
	}
	
	// The name of the foodstuff
	private String m_name;
}

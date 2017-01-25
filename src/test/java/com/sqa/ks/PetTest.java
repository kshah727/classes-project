/**
 * File Name: PetTest.java<br>
 * Shah, Krishna<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 21, 2017
 */
package com.sqa.ks;

import org.junit.*;

/**
 * PetTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Shah, Krishna
 * @version 1.0.0
 * @since 1.0
 */
public class PetTest {

	@Test
	public void test() {
		Pet[] pets = new Pet[6];
		String[] petNames = { "Gizmo", "Pedro", "Bailey", "Tyson", "Diesel", "Layla" };
		String[] food =
				{ "Apple", "Beggin Strip", "Carrot", "Bone", "Gummy Bear", "Strawberry" };
		for (int i = 0; i < petNames.length; i++) {
			pets[i] = new Pet(petNames[i], i * 7);
			pets[i].eat(food[i]);
		}
		for (Pet pet : pets) {
			System.out.println(pet);
		}
	}
}

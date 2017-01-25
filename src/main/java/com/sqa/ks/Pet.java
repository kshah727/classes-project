/**
 * File Name: Pet.java<br>
 * Shah, Krishna<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 21, 2017
 */
package com.sqa.ks;

public class Pet {

	private String name;

	private int age;

	private boolean hasRabies;

	private int petCosts;

	private char gender;

	public Pet() {
		this.name = "Unknown Pet";
		this.age = 3;
		this.hasRabies = false;
		this.petCosts = 100;
		this.gender = 'F';
	}

	public Pet(String name, int petCosts) {
		this();
		setName(name);
		setPetCosts(petCosts);
	}

	/**
	 * @param name
	 * @param age
	 * @param hasRabies
	 * @param petCosts
	 * @param gender
	 */
	public Pet(String name, int age, boolean hasRabies, int petCosts, char gender) {
		this.name = name;
		this.age = age;
		this.hasRabies = hasRabies;
		this.petCosts = petCosts;
		this.gender = gender;
	}

	public void eat(String foodItem) {
		System.out.println(getName() + " eats a " + foodItem);
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * @return the gender
	 */
	public int getGender() {
		return this.gender;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the petCosts
	 */
	public int getPetCosts() {
		return this.petCosts;
	}

	/**
	 * @return the hasRabies
	 */
	public boolean isHasRabies() {
		return this.hasRabies;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}

	/**
	 * @param hasRabies
	 *            the hasRabies to set
	 */
	public void setHasRabies(boolean hasRabies) {
		this.hasRabies = hasRabies;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param petCosts
	 *            the petCosts to set
	 */
	public void setPetCosts(int petCosts) {
		this.petCosts = petCosts;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pet [name=");
		builder.append(this.name);
		builder.append(", age=");
		builder.append(this.age);
		builder.append(", hasRabies=");
		builder.append(this.hasRabies);
		builder.append(", petCosts=");
		builder.append(this.petCosts);
		builder.append(", gender=");
		builder.append(this.gender);
		builder.append("]");
		return builder.toString();
	}
}

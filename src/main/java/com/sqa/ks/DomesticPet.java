/**
 * File Name: DomesticPet.java<br>
 * Shah, Krishna<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 23, 2017
 */
package com.sqa.ks;

/**
 * DomesticPet //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Shah, Krishna
 * @version 1.0.0
 * @since 1.0
 */
public class DomesticPet {

	private PetType petType;

	private double averageYearlyPetFees;

	private String mainFoodDish;

	private String typeOfNoise;

	private String name;

	// format mm/dd/yyyy
	private String dateOfBirth;

	private double priceOfPurchase;

	public DomesticPet(String name, PetType petType) {
		this();
		this.name = name;
		this.petType = petType;
	}

	public DomesticPet(String name, PetType petType, String dateOfBirth, String typeOfNoise) {
		this(name, petType);
		this.dateOfBirth = dateOfBirth;
		this.typeOfNoise = typeOfNoise;
	}

	public DomesticPet(String name, PetType petType, String dateOfBirth, String typeOfNoise,
			String mainFoodDish) {
		this(name, petType, dateOfBirth, typeOfNoise);
		this.mainFoodDish = mainFoodDish;
	}

	public DomesticPet(String name, PetType petType, String dateOfBirth, String typeOfNoise,
			String mainFoodDish, double priceOfPurchase, double averageYearlyPetFees) {
		super();
		this.name = name;
		this.petType = petType;
		this.dateOfBirth = dateOfBirth;
		this.typeOfNoise = typeOfNoise;
		this.mainFoodDish = mainFoodDish;
		this.priceOfPurchase = priceOfPurchase;
		this.averageYearlyPetFees = averageYearlyPetFees;
	}

	private DomesticPet() {
		this.name = "Unknown Pet";
		this.petType = null;
		this.dateOfBirth = "01/01/2017";
		this.typeOfNoise = "...";
		this.mainFoodDish = "cabbage";
		this.priceOfPurchase = 1.0;
		this.averageYearlyPetFees = 100.0;
	}

	public void buypet() {
		System.out.println("i bought" + this.getName() + "for" + this.getPriceOfPurchase()
				+ "and they cost me " + this.getAverageYearlyPetFees() + "a year./n i love this"
				+ this.getPetType().toString().toLowerCase() + "!");
	}

	public void eat() {
		System.out.println("this" + this.getPetType().toString().toLowerCase() + "loves"
				+ this.getMainFoodDish() + ".");
	}

	public double getAverageYearlyPetFees() {
		return this.averageYearlyPetFees;
	}

	public String getDateOfBirth() {
		return this.dateOfBirth;
	}

	public String getMainFoodDish() {
		return this.mainFoodDish;
	}

	public String getName() {
		return this.name;
	}

	public PetType getPetType() {
		return this.petType;
	}

	public double getPriceOfPurchase() {
		return this.priceOfPurchase;
	}

	public String getTypeOfNoise() {
		return this.typeOfNoise;
	}

	public void makeSound() {
		System.out.println(this.name + "makes the sound" + this.getTypeOfNoise() + ".");
	}

	public void setAverageYearlyPetFees(double averageYearlyPetFees) {
		this.averageYearlyPetFees = averageYearlyPetFees;
	}

	public void setMainFoodDish(String mainFoodDish) {
		this.mainFoodDish = mainFoodDish;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPriceOfPurchase(double priceOfPurchase) {
		this.priceOfPurchase = priceOfPurchase;
	}

	public void setTypeOfNoise(String typeOfNoise) {
		this.typeOfNoise = typeOfNoise;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DomesticPet [name=");
		builder.append(this.name);
		builder.append(", PetType=");
		builder.append(this.petType);
		builder.append(", dateOfBirth=");
		builder.append(this.dateOfBirth);
		builder.append(", typeOfNoise=");
		builder.append(this.typeOfNoise);
		builder.append(", mainFoodDish=");
		builder.append(this.mainFoodDish);
		builder.append(", priceOfPurchase=");
		builder.append(this.priceOfPurchase);
		builder.append(", averageYearlyPetFees=");
		builder.append(this.averageYearlyPetFees);
		builder.append("]");
		return builder.toString();
	}
}

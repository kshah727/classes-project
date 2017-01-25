/**
 * File Name: DomesticPetTest.java<br>
 * Shah, Krishna<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 23, 2017
 */
package com.sqa.ks;

import org.junit.*;

public class DomesticPetTest {

	static DomesticPet[] allPets = new DomesticPet[5];

	static private int numOfPets;

	@Test
	public void testBird() {
		String expected =
				"DomesticPet [name=Chirpey, PetType=BIRD, dateOfBirth=01/01/2017, typeOfNoise=..., mainFoodDish=cabbage, priceOfPurchase=1.0, averageYearlyPetFees=100.0]";
		System.out.println("Testing Bird...");
		DomesticPet bird = new DomesticPet("Chirpey", PetType.BIRD);
		System.out.println(bird.toString());
		this.allPets[0] = bird;
		testZooOfAnimals();
		Assert.assertEquals("Bird is not created correctly.", expected, bird.toString());
	}

	@Test
	public void testCat() {
		String expected =
				"DomesticPet [name=Garfield, PetType=CAT, dateOfBirth=01/03/2016, typeOfNoise=blabla, mainFoodDish=cabbage, priceOfPurchase=1.0, averageYearlyPetFees=100.0]";
		System.out.println("Testing cat...");
		DomesticPet cat = new DomesticPet("Garfield", PetType.CAT, "01/03/2016", "blabla");
		System.out.println(cat.toString());
		this.allPets[1] = cat;
		testZooOfAnimals();
		Assert.assertEquals("cat is not created correctly.", expected, cat.toString());
	}

	@Test
	public void testChicken() {
		String expected =
				"DomesticPet [name=ken, PetType=CHICKEN, dateOfBirth=03/02/15, typeOfNoise=cluckcluck, mainFoodDish=corn, priceOfPurchase=1.0, averageYearlyPetFees=100.0]";
		System.out.println("Testing chicken...");
		DomesticPet chicken =
				new DomesticPet("ken", PetType.CHICKEN, "03/02/15", "cluckcluck", "corn");
		System.out.println(chicken.toString());
		this.allPets[2] = chicken;
		testZooOfAnimals();
		Assert.assertEquals("chicken is not created correctly.", expected, chicken.toString());
	}

	@Test
	public void testDog() {
		String expected =
				"DomesticPet [name=sebastian, PetType=DOG, dateOfBirth=01/01/2017, typeOfNoise=..., mainFoodDish=cabbage, priceOfPurchase=1.0, averageYearlyPetFees=100.0]";
		System.out.println("Testing Dog...");
		DomesticPet dog = new DomesticPet("sebastian", PetType.DOG);
		System.out.println(dog.toString());
		this.allPets[3] = dog;
		testZooOfAnimals();
		Assert.assertEquals("dog is not created correctly.", expected, dog.toString());
	}

	@Test
	public void testFish() {
		String expected =
				"DomesticPet [name=nemo, PetType=FISH, dateOfBirth=01/01/2017, typeOfNoise=..., mainFoodDish=cabbage, priceOfPurchase=1.0, averageYearlyPetFees=100.0]";
		System.out.println("Testing fish...");
		DomesticPet fish = new DomesticPet("nemo", PetType.FISH);
		System.out.println(fish.toString());
		this.allPets[4] = fish;
		testZooOfAnimals();
		Assert.assertEquals("fish is not created correctly.", expected, fish.toString());
	}

	// why did we not add @test here?
	public void testZooOfAnimals() {
		this.numOfPets++;
		if (this.numOfPets == 5) {
			for (int i = 0; i < this.allPets.length; i++) {
				this.allPets[i].buypet();
				this.allPets[i].makeSound();
				this.allPets[i].eat();
			}
		}
	}
}
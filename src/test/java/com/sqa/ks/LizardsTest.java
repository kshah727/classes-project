package com.sqa.ks;

import org.junit.*;

public class LizardsTest {

	static Lizards[] allLizards = new Lizards[3];

	// why did we define this?
	static private int numOfLizards;

	@Test
	public void testNAG() {
		String expected =
				"Lizards Lizards [name=Geico, age=2, gender=f, color=green, canSwim=false]";
		System.out.println("..");
		Lizards lizard1 = new Lizards("Geico", 2, 'f');
		System.out.println(lizard1.toString());
		this.allLizards[0] = lizard1;
		testZooOfAnimals();
	}

	@Test
	public void testNAGC() {
		String expected = "Lizards [name=Geico, age=2, gender=f, color=null, canSwim=false]";
		System.out.println();
		Lizards lizard2 = new Lizards("croco", 1, 'M', "black");
		System.out.println(lizard2.toString());
		this.allLizards[1] = lizard2;
		testZooOfAnimals();
	}

	@Test
	public void testNAGCS() {
		String expected = "Lizards [name=Geico, age=2, gender=f, color=null, canSwim=false]";
		System.out.println();
		Lizards lizard3 = new Lizards("Gecko", 3, 'F', "brown", true);
		System.out.println(lizard3.toString());
		this.allLizards[2] = lizard3;
		testZooOfAnimals();
	}

	public void testZooOfAnimals() {
		this.numOfLizards++;
		if (this.numOfLizards == 3) {
			for (int i = 0; i < this.allLizards.length; i++) {
				this.allLizards[i].getname();
				this.allLizards[i].getage();
				this.allLizards[i].iscanswim();
			}
		}
	}
}

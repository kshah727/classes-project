package com.sqa.ks;

public class Lizards {

	private String name;

	private int age;

	private boolean canSwim;

	private String color;

	private char gender;

	public Lizards(String name, int age, char gender) {
		this();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Lizards(String name, int age, char gender, String color) {
		this(name, age, gender);
		this.color = color;
	}

	public Lizards(String name, int age, char gender, String color, boolean canSwim) {
		this(name, age, gender, color);
		this.canSwim = canSwim;
	}

	private Lizards() {
		this.name = "Stella";
		this.age = 2;
		this.gender = 'F';
		this.color = "green";
		this.canSwim = false;
	}

	public void getage() {
		System.out.println(this.age + "is old but not too old!");
	}

	public int getAge() {
		return this.age;
	}

	public String getColor() {
		return this.color;
	}

	public char getGender() {
		return this.gender;
	}

	public void getname() {
		System.out.println(this.canSwim + "but loves to be on the land");
	}

	public String getName() {
		return this.name;
	}

	public void iscanswim() {
		System.out.println(this.name + "loves to be in the water and on the land");
	}

	public boolean isCanSwim() {
		return this.canSwim;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lizards [name=");
		builder.append(this.name);
		builder.append(", age=");
		builder.append(this.age);
		builder.append(", gender=");
		builder.append(this.gender);
		builder.append(", color=");
		builder.append(this.color);
		builder.append(", canSwim=");
		builder.append(this.canSwim);
		builder.append("]");
		return builder.toString();
	}
}

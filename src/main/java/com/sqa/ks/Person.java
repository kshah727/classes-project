package com.sqa.ks;

/**
 * File Name: Person.java<br>
 * Shah, Krishna<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 21, 2017
 */
/**
 * Person //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Shah, Krishna
 * @version 1.0.0
 * @since 1.0
 */
public class Person {

	private int age;

	private String name;

	private String address;

	private char gender;

	private boolean isAwake;

	private double hourlyRate;

	private String jobTitle;
	{
	}

	public Person() {
		this.name = "Jane Doe";
		this.age = 21;
		this.gender = 'F';
		this.jobTitle = "Astronaut";
		this.hourlyRate = 200;
		this.address = "123 qwerty st";
		this.isAwake = false;
	}

	public Person(String name) {
		this();
		this.name = name;
	}

	public Person(String name, int age, char gender, String jobTitle, double hourlyRate, String address,
			boolean isAwake) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.jobTitle = jobTitle;
		this.hourlyRate = hourlyRate;
		this.address = address;
		this.isAwake = isAwake;
	}

	public Person(String name, int age, String jobTitle) {
		this(name);
		setAge(age);
		setJobTitle(jobTitle);
	}

	public void doWork() {
		if (this.isAwake == false) {
			wakeUp();
		}
		System.out.println(this.getName() + " does work!");
	}

	public void eat(String... food) {
		System.out.println(this.getName() + "is hungry...\n They start eating...");
		for (String item : food) {
			System.out.print(food + "was eaten.");
		}
		System.out.println();
		{
		}
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return this.address;
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
	public char getGender() {
		return this.gender;
	}

	/**
	 * @return the hourlyRate
	 */
	public double getHourlyRate() {
		return this.hourlyRate;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return this.jobTitle;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the isAwake
	 */
	public boolean isAwake() {
		return this.isAwake;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param isAwake
	 *            the isAwake to set
	 */
	public void setAwake(boolean isAwake) {
		this.isAwake = isAwake;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}

	/**
	 * @param hourlyRate
	 *            the hourlyRate to set
	 */
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	/**
	 * @param jobTitle
	 *            the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void sleep() {
		if (this.isAwake == true) {
			System.out.println(this.getName() + "goes to sleep...");
			this.isAwake = false;
		}
		System.out.println(this.getName() + " does work!");
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(this.name);
		builder.append(", age=");
		builder.append(this.age);
		builder.append(", gender=");
		builder.append(this.gender);
		builder.append(", jobTitle=");
		builder.append(this.jobTitle);
		builder.append(", hourlyRate=");
		builder.append(this.hourlyRate);
		builder.append(", address=");
		builder.append(this.address);
		builder.append(", isAwake=");
		builder.append(this.isAwake);
		builder.append("]");
		return builder.toString();
	}

	public void wakeUp() {
		if (this.isAwake == false) {
			System.out.println(this.getName() + "just woke up...");
			this.isAwake = true;
		}
	}
}
// @Override
// public String toString() {
// StringBuilder sb = new StringBuilder();
// sb.append("Name: " + this.name + "\n");
// sb.append("Age: " + this.age + "\n");
// sb.append("Job Title: " + this.jobTitle + "\n");
// return sb.toString();
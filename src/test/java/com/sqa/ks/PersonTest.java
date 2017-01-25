/**
 * File Name: PersonTest.java<br>
 * Shah, Krishna<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 21, 2017
 */
package com.sqa.ks;

import org.junit.*;

/**
 * PersonTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Shah, Krishna
 * @version 1.0.0
 * @since 1.0
 */
public class PersonTest {

	@Test
	public void test() {
		Person person1 = new Person("John");
		Person person2 = new Person("Jane", 22, "Shoemaker");
		Person person3 = new Person("krishna ", 24, 'F', "Baker ", 1.0, "123 abc street ", true);
		System.out.println(person1);
		System.out.println(person2.toString());
		System.out.println(person3.toString());
		String[] names = { "Ks", "krishna", "krishna", "kris", "JF" };
		Person[] people = new Person[5];
		for (int i = 0; i < people.length; i++) {
			people[i] = new Person(names[i]);
			people[i].sleep();
			people[i].doWork();
			people[i].eat("Banana", "apple", "avocado sandwich");
			people[i].sleep();
			people[i].sleep();
		}
	}
}

/**
 * 
 */
package com.java.designpatterns.oops.concepts;

/**
 * @author ankur.mahajan
 * @written 09-Jun-2019
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// SuperClass cls = new SubClass();
		Contact obj1 = new Friend();
		// Friend obj1 = new Friend();

		// Casting is required.
		((Friend) obj1).phone = "123";
		obj1.name = "Ankur";

		Contact obj2 = new Work();
		// Work obj2 = new Work();
		((Work) obj2).email = "mahajanchanchal@gmail.com";
		obj2.name = "atu";
		System.out.println(obj1);
		System.out.println(obj2);

	}

}

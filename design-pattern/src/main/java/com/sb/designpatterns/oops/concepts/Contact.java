/**
 * 
 */
package com.sb.designpatterns.oops.concepts;

/**
 * @author ankur.mahajan
 * @written 09-Jun-2019
 */
public class Contact {

	public String name;

	@Override
	public String toString() {
		System.out.println("Contact's toString");
		String temp = null;
		if (this instanceof Work) {
			temp = "email : " + ((Work) this).email + " and name : " + name;
		} else if (this instanceof Friend) {
			temp = "phone : " + ((Friend) this).phone + " and name : " + name;
		} else {
			System.out.println("No of a type.");
		}
		return temp;
	}

}

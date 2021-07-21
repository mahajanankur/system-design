/**
 * 
 */
package com.sb.designpatterns.singleton.first;

import java.lang.reflect.Constructor;

/**
 * @author amahajan
 *
 * @written 10-May-2017
 * 
 *          Reflection can be used to destroy all the above singleton
 *          implementation approaches. To overcome this situation with
 *          Reflection, Joshua Bloch suggests the use of Enum to implement
 *          Singleton design pattern as Java ensures that any enum value is
 *          instantiated only once in a Java program. Since Java Enum values are
 *          globally accessible, so is the singleton. The drawback is that the
 *          enum type is somewhat inflexible; for example, it does not allow
 *          lazy initialization.
 *
 */
public class DestroySingletonUsingReflection {

	public static void main(String[] args) {

		EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instance2 = null;
		try {
			Constructor<?>[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
			for (Constructor<?> constructor : constructors) {
				constructor.setAccessible(true);
				instance2 = (EagerInitializedSingleton) constructor.newInstance(null);
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("HashCode of instance1: " + instance1.hashCode());
		System.out.println("HashCode of instance2: " + instance2.hashCode());

	}
}

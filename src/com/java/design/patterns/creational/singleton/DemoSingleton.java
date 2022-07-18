// https://howtodoinjava.com/design-patterns/creational/singleton-design-pattern-in-java/

package com.java.design.patterns.creational.singleton;

import java.io.Serializable;

public class DemoSingleton implements Serializable {

	/**
	 * This is required in cases where your class structure changes between
	 * serialization and deserialization. A changed class structure will cause the
	 * JVM to give an exception in the de-serializing process.
	 * 
	 * java.io.InvalidClassException: class incompatible
	 * 
	 * This problem can be solved only by adding a unique serial version id to the
	 * class. It will prevent the compiler from throwing the exception by telling it
	 * that both classes are same, and will load the available instance variables
	 * only.
	 */

	private static final long serialVersionUID = 1L;

	private DemoSingleton() {
		// private constructor
	}

	/**
	 * class will not be initialized until required
	 * 
	 *
	 */

	private static class DemoSingletonHolder {
		public static final DemoSingleton INSTANCE = new DemoSingleton();
	}

	public static DemoSingleton getInstance() {
		return DemoSingletonHolder.INSTANCE;
	}

	/**
	 * 
	 * Let’s say your application is distributed and it frequently serializes
	 * objects into the file system, only to read them later when required. Please
	 * note that de-serialization always creates a new instance.
	 * 
	 * 
	 * To solve this issue, we need to include a readResolve() method in our class.
	 * This method will be invoked when you will de-serialize the object. Inside of
	 * this method, you must return the existing instance to ensure a single
	 * instance application wide.
	 */
	protected Object readResolve() {
		return getInstance();
	}

}
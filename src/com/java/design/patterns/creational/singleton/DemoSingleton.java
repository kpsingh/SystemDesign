// https://howtodoinjava.com/design-patterns/creational/singleton-design-pattern-in-java/

package com.java.design.patterns.creational.singleton;

import java.io.Serializable;

public class DemoSingleton implements Serializable {

	/**
	 * serialVersionUID
	 * 
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
		getInstance();
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
	 * 
	 * 
	 * For Serializable and Externalizable classes, the readResolve() method allows
	 * a class to replace/resolve the object read from the stream before it is
	 * returned to the caller. By implementing the readResolve method, a class can
	 * directly control the types and instances of its own instances being
	 * deserialized. The method is defined as follows:
	 * 
	 * ANY-ACCESS-MODIFIER Object readResolve() throws ObjectStreamException;
	 * 
	 * The readResolve method is called when ObjectInputStream has read an object
	 * from the stream and is preparing to return it to the caller.
	 * 
	 * ObjectInputStream checks whether the class of the object defines the
	 * readResolve method. If the method is defined, the readResolve method is
	 * called to allow the object in the stream to designate the object to be
	 * returned. The object returned should be of a type that is compatible with all
	 * uses. If it is not compatible, a ClassCastException will be thrown when the
	 * type mismatch is discovered.
	 */

	protected Object readResolve() {
		return getInstance();
	}

	/**
	 * Using the "clone" method, we can create a copy of the original object; it's
	 * the same thing if we applied clone in the singleton pattern. It will create
	 * two instances: one original and another one cloned object. In this case, we
	 * will break the Singleton principle.
	 * 
	 * 
	 * To overcome the above issue, we need to implement/override the clone() method
	 * and throw an exception CloneNotSupportedException from the clone method. If
	 * anyone tries to create a clone object of Singleton, it will throw an
	 * exception
	 */

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
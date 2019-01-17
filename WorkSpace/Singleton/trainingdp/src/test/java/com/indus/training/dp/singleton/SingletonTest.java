/**
 * $Date: $
 * $Revision: $
 * $Author: $
 * $HeadURL: $
 * $Id: $ 
 *
  **/
package com.indus.training.dp.singleton;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

import org.junit.Test;

public class SingletonTest {

	// @Test
	public void testGetConnection() throws Exception {

		DBConnection expected = DBConnection.getConnection();

		DBConnection actual = DBConnection.getConnection();

		assertEquals(expected, actual);
	}

	// @Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	// @Test
	public void testClone() throws Exception {

		DBConnection orig = DBConnection.getConnection();

		// assertTrue(orig instanceof Cloneable);

		try {
			DBConnection clone = (DBConnection) orig.clone();
			assertEquals(orig, clone);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// @Test
	public void testSerializeInMemory() throws Exception {
		DBConnection orig = DBConnection.getConnection();
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		byte[] byteArray = null;
		DBConnection clone = null;
		try {
			ObjectOutputStream objOut = new ObjectOutputStream(byteOut);
			objOut.writeObject(orig);
			byteArray = byteOut.toByteArray();
			objOut.close();
			ByteArrayInputStream byteIn = new ByteArrayInputStream(byteArray);
			try {
				ObjectInputStream objIn = new ObjectInputStream(byteIn);
				clone = (DBConnection) objIn.readObject();
				objIn.close();
				assertEquals(orig, clone);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException clznfe) {
				// TODO Auto-generated catch block
				clznfe.printStackTrace();
			}
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}

	}

	// @Test
	public void testSerializeFileBased() throws Exception {
		DBConnection orig = DBConnection.getConnection();
		ObjectOutputStream objOut;
		DBConnection clone = null;

		try {

			objOut = new ObjectOutputStream(new FileOutputStream("DBConnection.ser"));
			objOut.writeObject(orig);
			objOut.close();

			ObjectInput objIn = new ObjectInputStream(new FileInputStream("DBConnection.ser"));
			try {
				clone = (DBConnection) objIn.readObject();
				objIn.close();

			} catch (ClassNotFoundException clznfe) {
				// TODO Auto-generated catch block
				clznfe.printStackTrace();
			} catch (java.io.InvalidClassException invex) {

				invex.printStackTrace();
			}
			assertEquals(orig, clone);
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}
	}

	 @Test
	public void testMultiThread() {

		SingletonThread t1 = new SingletonThread("Singleton Thread 1");
		SingletonThread t2 = new SingletonThread("Singleton Thread 2");
		SingletonThread t3 = new SingletonThread("Singleton Thread 3");
		SingletonThread t4 = new SingletonThread("Singleton Thread 4");

		t1.start();

		t2.start();

		t3.start();

		t4.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBConnection conn1 = t1.getConn();
		DBConnection conn2 = t2.getConn();
		DBConnection conn3 = t3.getConn();
		DBConnection conn4 = t4.getConn();

		assertEquals(conn1, conn2);
		assertEquals(conn3, conn4);
	}

	//@Test
	public void testReflection() {
		Class clz = DBConnection.class;
		Class anotherClz = null;
		Class yetAnotherclz = null;

		try {
			yetAnotherclz = DBConnection.getConnection().getClass();

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			anotherClz = Class.forName("com.indus.training.dp.singleton.DBConnection");
		} catch (ClassNotFoundException clnfe) {

			clnfe.printStackTrace();
		}

		DBConnection conn = null;
		
		try {
			conn = DBConnection.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		DBConnection anotherConn = null;

		try {
			Constructor<DBConnection>[] constructors = clz.getDeclaredConstructors();

			for (int i = 0; i < constructors.length; i++) {
				System.out.println(constructors[i]);
				try {
					constructors[i].setAccessible(true);
					anotherConn = constructors[i].newInstance();
				} catch (InstantiationException instEx) {
					instEx.printStackTrace();
				} catch (IllegalAccessException illAccEx) {
					illAccEx.printStackTrace();
				} catch (IllegalArgumentException illArgEx) {
					illArgEx.printStackTrace();
				} catch (InvocationTargetException invTarEx) {
					invTarEx.printStackTrace();
				}
			}
		} catch (SecurityException secEx) {
			secEx.printStackTrace();
		}

		assertEquals(conn, anotherConn);
	}

}

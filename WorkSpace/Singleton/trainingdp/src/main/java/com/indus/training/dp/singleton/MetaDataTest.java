package com.indus.training.dp.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MetaDataTest {

	public static void main(String[] args) throws Exception {

		DBConnection conn = DBConnection.getConnection();

		DBConnection anotherConn = conn.getConnection();

		Class dbconnClz = DBConnection.class;

		Class anotherDbconnClz = conn.getClass();

		System.out.println(dbconnClz.hashCode());

		System.out.println(anotherDbconnClz.hashCode());

		System.out.println(dbconnClz.getClass().getName());

		Method[] methods = dbconnClz.getMethods();

		for (int i = 0; i < methods.length; i++) {
			System.out.println("Methods : " + methods[i].getName());
		}

		Constructor<DBConnection>[] constructors = dbconnClz.getConstructors();

		for (int i = 0; i < constructors.length; i++) {
			System.out.println("Constructors : " + constructors[i].getName());
		}

		Constructor<DBConnection>[] declaredConstructors = dbconnClz.getDeclaredConstructors();

		for (int i = 0; i < declaredConstructors.length; i++) {
			System.out.println("Declared Constructors : " + declaredConstructors[i].getName());
		}
	}

}

package com.indus.training.orm.domain;

import com.indus.training.orm.dao.infra.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HibernateUtil obj = new HibernateUtil();
		System.out.println(obj.getSessionFactory());
	}

}

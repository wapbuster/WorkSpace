package com.indus.training.orm.dao;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCountryDAO.class, TestDeptDAO.class, TestEmployeeDAO.class, TestRegionDAO.class })
public class AllTests {

}

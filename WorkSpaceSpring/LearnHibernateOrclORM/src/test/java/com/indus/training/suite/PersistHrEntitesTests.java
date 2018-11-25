package com.indus.training.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.indus.training.orm.dao.TestCountryDAO;
import com.indus.training.orm.dao.TestDeptDAO;
import com.indus.training.orm.dao.TestEmployeeDAO;
import com.indus.training.orm.dao.TestRegionDAO;

@RunWith(Suite.class)
@SuiteClasses({ TestCountryDAO.class, TestDeptDAO.class, TestEmployeeDAO.class, TestRegionDAO.class })
public class PersistHrEntitesTests {

}

package com.javainterviewpoint;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //Reading the Configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        
        //Get the EmployeeServiceImpl bean
        EmployeeServiceImpl employeeServiceImpl = (EmployeeServiceImpl)context.getBean("employeeServiceImpl");
        
        //Create Employee object
        Employee employee = new Employee();
        employee.setAge(55);
        employee.setDept("Blogging");
        employee.setName("JIP");
        
        //Save the new Employee
        employeeServiceImpl.saveEmployee(employee);
        //Read the Employee 
        Employee emp = employeeServiceImpl.getEmployeeById(1);
        //Retrieve all the Employees
        List<Employee> employeeList = employeeServiceImpl.getAllEmployees();
        System.out.println("*** List of all Employees *** ");
        for(Employee emp1 : employeeList)
        {
            System.out.println("Employee Id   :"+emp1.getId());
            System.out.println("Employee Name :"+emp1.getName());
            System.out.println("Employee Age  :"+emp1.getAge());
            System.out.println("Department :"+emp1.getDept());
            System.out.println();
        }
        System.out.println("*************************************");
        
        //Delete Employee
        employeeServiceImpl.deleteEmployee(1);
        
        context.close();
    }
}

package com.javainterviewpoint;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



public class Employee_Address
{
    @Id
    @GeneratedValue
    @Column(name="EMP_ID")
    private int empId;
    
    @Column(name="STREET")
    private String street;
    @Column(name="CITY")
    private String city;
    @Column(name="STATE")
    private String state;
    @Column(name="COUNTRY")
    private String country;
    
    private Employee employee;

    public Employee_Address()
    {
        super();
    }

    public Employee_Address(int empId, String street, String city, String state, String country, Employee employee)
    {
        super();
        this.empId = empId;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.employee = employee;
    }

    public int getEmpId()
    {
        return empId;
    }

    public void setEmpId(int empId)
    {
        this.empId = empId;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public Employee getEmployee()
    {
        return employee;
    }

    public void setEmployee(Employee employee)
    {
        this.employee = employee;
    }

    @Override
    public String toString()
    {
        return "Employee_Address [empId=" + empId + ", street=" + street + ", city=" + city + ", state=" + state
                + ", country=" + country + ", employee=" + employee + "]";
    }
}
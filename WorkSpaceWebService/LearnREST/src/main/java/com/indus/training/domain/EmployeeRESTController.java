package com.indus.training.domain;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
 
import com.indus.training.model.EmployeeListVO;
import com.indus.training.model.EmployeeVO;
 
@Controller
public class EmployeeRESTController
{
     
    private EmployeeListVO getEmployeesCollection()
    {
        EmployeeListVO employees = new EmployeeListVO();
         
        EmployeeVO empOne = new EmployeeVO(1,"sai","Nana","snanda@gmail.com");
        EmployeeVO empTwo = new EmployeeVO(2,"trump","jr","jt@yahoo.com");
        EmployeeVO empThree = new EmployeeVO(3,"kat","rina","kat@gmail.com");
         
         
        employees.getEmployees().add(empOne);
        employees.getEmployees().add(empTwo);
        employees.getEmployees().add(empThree);
         
        return employees;
    }
     
    @RequestMapping(value = "/employees")
    public String getAllEmployeesJSON(Model model)
    {
        model.addAttribute("employees", getEmployeesCollection());
        return "jsonTemplate";
    }
}
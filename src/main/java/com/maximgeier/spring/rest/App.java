package com.maximgeier.spring.rest;

import com.maximgeier.spring.rest.configuration.MyConfig;
import com.maximgeier.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
        //Get all employees
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

        //Get one employee by ID
//        Employee empById = communication.getEmployee(1);
//        System.out.println(empById);

        //Save employee by ID
//        Employee emp = new Employee("Jane", "Smith", "HR", 900);
//        emp.setId(18);
//        communication.saveEmployee(emp);

        //Delete employee by ID
        communication.deleteEmployee(4);
    }
}

package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.hr.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTests {


    @Test
    public void walking_gets_employee_discount_returns_true() {
        // what
        Employee employee = new Employee("Jimmy", "Crackcorn");
        Map<String, Double> testMap = new HashMap<>();
        testMap.put("Walking", 10.0);

        // how
        double total = employee.getBalanceDue(testMap);

        // result
        Assert.assertEquals(5.0, total, 0.2);
    }

    @Test
    public void grooming_doesnt_get_employee_discount_returns_true() {
        // what
        Employee employee = new Employee("Jimmy", "Crackcorn");
        Map<String, Double> testMap = new HashMap<>();
        testMap.put("Grooming", 10.0);

        // how
        double total = employee.getBalanceDue(testMap);

        // result
        Assert.assertEquals(10.0, total, 0.2);
    }
}

package com.techelevator.crm;

import com.techelevator.hr.Customer;
import com.techelevator.hr.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTests {

    @Test
    public void walking_doesnt_get_employee_discount_returns_true() {
        // what
        Customer customer = new Customer("Karen", "Crackcorn");
        Map<String, Double> testMap = new HashMap<>();
        testMap.put("Walking", 10.0);

        // how
        double total = customer.getBalanceDue(testMap);

        // result
        Assert.assertEquals(10.0, total, 0.2);
    }

    @Test
    public void do_services_add_up_correctly() {
        // what
        Customer customer = new Customer("Chad", "Crackcorn");
        Map<String, Double> testMap = new HashMap<>();
        testMap.put("Walking", 10.0);
        testMap.put("Grooming", 60.0);
        testMap.put("Snuggles", 1.0);

        // how
        double total = customer.getBalanceDue(testMap);

        // result
        Assert.assertEquals(71.0, total, 0.2);
    }


}



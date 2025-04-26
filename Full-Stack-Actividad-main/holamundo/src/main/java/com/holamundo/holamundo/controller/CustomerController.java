package com.holamundo.holamundo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import com.holamundo.holamundo.domain.Customer;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class CustomerController {

    private List<Customer> customers = new ArrayList<>(Arrays.asList(
        new Customer(123, "G", "GE","1234"),
        new Customer(456, "A", "AL","456"),
        new Customer(789, "L", "LA","789"),
        new Customer(234, "C", "CA","234")
    ));

    @GetMapping("/datos")
    public List<Customer> getCustomers(){
        return customers;
    }





}

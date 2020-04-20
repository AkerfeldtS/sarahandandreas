package com.aprilproject.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository repository;
    
    @GetMapping("/customer")
    public String customerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer";
    }

    @PostMapping("/customer")
    public String customerSubmit(@ModelAttribute Customer customer) {
        repository.save(customer);
        return "customerResult";
    }

    @GetMapping("/allCustomers")
    public String getCustomers(Model model) {
        List<Customer> list = repository.findAll();
        model.addAttribute("list", list);
        return "allCustomers";
     }

}
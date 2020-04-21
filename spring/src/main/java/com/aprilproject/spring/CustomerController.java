package com.aprilproject.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
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
       // List<Customer> list = repository.findAll();
       setCustomerModel(model);
        return "customer";
    }

    @PostMapping("/customer")
    public String customerSubmit(@ModelAttribute Customer customer, Model model) {
        repository.save(customer);
        setCustomerModel(model);
        return "customer";
    }

    @DeleteMapping("/customerDelete")
    public String deleteCustomer(@ModelAttribute Customer customer, Model model) {
        repository.deleteById(customer.id);
        setCustomerModel(model);
        return "customer";
    }

    @GetMapping("/allCustomers")
    public String getCustomers(Model model) {
        setCustomerModel(model);
        return "allCustomers";
     }

     private void setCustomerModel(Model model) {
        model.addAttribute("list", repository.findAll());
     }

}
package com.aprilproject.spring;

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

    @PostMapping("/customer/deleteAll")
    public String deleteAllCustomers(Model model) {
        repository.deleteAll();
        setCustomerModel(model);
        return "redirect:/customer";
    }

    @PostMapping("/customer/deleteCustomer")
    public String deleteCustomer(@ModelAttribute String id, Model model) {
        repository.deleteById(id);
        setCustomerModel(model);
        return "redirect:/customer"; 
    }

     private void setCustomerModel(Model model) {
        model.addAttribute("list", repository.findAll());
     }

}
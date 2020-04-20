package com.aprilproject.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
/* 
	@Override
	public void run(String... args) throws Exception {
		
		repository.deleteAll();
		Customer customer1 = new Customer("Sarah");

		repository.save(customer1);

		//save customers
		repository.save(new Customer("Alice"));
		repository.save(new Customer("Bob"));

		//fetch all customers
		System.out.println("Customers found with findAll()");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}

		System.out.println();

		//fetch an individual customer by firstname
		System.out.println("Customer found with findByFirstName('Alice'): ");
		System.out.println(repository.findByFirstName("Alice"));

		// //fetch an individual customer by lastname
		// System.out.println("Customer found with findByLastName('Smith'): ");
		// for (Customer customer : repository.findByLastName("Smith")) {
		// 	System.out.println(customer);
		// }
	}
	*/

}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.enitity.Customer;
import com.example.demo.repository.CustomerRepository;

@SpringBootApplication
public class Springboot1Application implements CommandLineRunner {
	
	@Autowired
	private CustomerRepository customerrepository;

	public static void main(String[] args) {
		SpringApplication.run(Springboot1Application.class, args);
		}
		
		
		@Override
		public void run(String... args) {
		// Inserting entries
		insert(1, "John", 25);
		insert(2, "Alice", 30);
		// Fetching entries
		System.out.println(fetch(1));
		System.out.println(fetch(2));
		}
		public void insert(int id, String name, int age) {
		Customer customer = new Customer();
		customer.setCUST_ID(id);
		customer.setNAME(name);
		customer.setAGE(age);
		customerrepository.save(customer);
		}
		public String fetch(int id) {
		Customer customer = (Customer) customerrepository.findById(id).orElse(null);
		if (customer != null) {
		return "ID: " + customer.getCUST_ID() +
		", Name: " + customer.getNAME() +
		", Age: " + customer.getAGE();
		} else {
		return "Customer not found!";
		}
		
		
	}

}

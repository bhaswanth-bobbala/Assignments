package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/print", method = RequestMethod.GET)
	public ModelAndView name() {
		ModelAndView view = new ModelAndView("index");
		return view;
	}

	@RequestMapping(value = "/printcreate", method = RequestMethod.GET)
	public ModelAndView create() {
		ModelAndView view = new ModelAndView("create");
		return view;
	}

	@RequestMapping(value = "/printbyname", method = RequestMethod.GET)
	public ModelAndView byName() {
		ModelAndView view = new ModelAndView("byName");
		return view;
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView update() {
		ModelAndView view = new ModelAndView("update");
		return view;
	}

	@RequestMapping(value = "/deletebyname", method = RequestMethod.GET)
	public ModelAndView deletebyName() {
		ModelAndView view = new ModelAndView("delete");
		return view;
	}

	@PostMapping("/create")
	public String create(String firstName, String lastName, String street, String city, String state, String country,
			long zipcode) {
		Customer customer = customerService.create(firstName, lastName, street, city, state, country, zipcode);
		return customer.toString();
	}

	@GetMapping("/fetchAll")
	public List<Customer> fetchAll() {
		return customerService.fetchAll();
	}

	@GetMapping("/fetchByName")
	public Customer fetchByName(String firstName, String lastName) {
		return customerService.fetchByName(firstName, lastName);
	}

	@PostMapping("/update")
	public String update(String firstName, String lastName, String street, String city, String state, String country,
			long zipcode) {
		Customer customer = customerService.update(firstName, lastName, street, city, state, country, zipcode);
		return customer.toString();
	}

	@GetMapping("/delete")
	public String deleteByName(String firstName, String lastName) {
		customerService.deleteByName(firstName, lastName);
		return "Deleted Customer " + firstName + " " + lastName;
	}

}

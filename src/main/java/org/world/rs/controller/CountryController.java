package org.world.rs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.world.rs.entity.City;
import org.world.rs.entity.Country;
import org.world.rs.repository.CountryRepository;

@RestController
public class CountryController {
	
	@Autowired
	private CountryRepository countryRepository;
	

	@RequestMapping(value="/country", method = RequestMethod.GET)
	@ResponseBody
	public List<Country> getAll() {
		return countryRepository.getAll();
	}
	
	@RequestMapping(value="/country/{code}", method = RequestMethod.GET)
	@ResponseBody
	public Country getByID(@PathVariable String code) {
		return countryRepository.getByID(code);
	}
	
	@RequestMapping(value="/country/name/{name}", method = RequestMethod.GET)
	@ResponseBody
	public Country getByName(@PathVariable String name) {
		return countryRepository.getByName(name);
	}
	
	/*@RequestMapping(value="/country/continent/{continent}", method = RequestMethod.GET)
	@ResponseBody
	public List<Country> getByContinent(@PathVariable String continent) {
		return countryRepository.getByName(name);
	}
	*/
	

}

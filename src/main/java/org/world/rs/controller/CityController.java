package org.world.rs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.world.rs.entity.City;
import org.world.rs.repository.CityRepository;

@RestController
public class CityController {
	
	@Autowired
	private CityRepository cityRepository;
	
	@RequestMapping(value="/city", method = RequestMethod.GET)
	public List<City> getAll() {
		return cityRepository.getAll();
	}
}

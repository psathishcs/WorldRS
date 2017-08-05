package org.world.rs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.world.rs.entity.City;
import org.world.rs.entity.CountryLanguage;
import org.world.rs.repository.CountryLanguageRepository;

@RestController
public class CountryLanguageController {
	@Autowired
	private CountryLanguageRepository countryLanguageRepository;
	
	@RequestMapping(value="/language", method = RequestMethod.GET)
	@ResponseBody
	public List<CountryLanguage> getAll() {
		return countryLanguageRepository.getAll();
	}
}

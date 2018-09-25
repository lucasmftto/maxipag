package br.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.service.CityService;

@RestController
@RequestMapping("/pessoas")
public class Hello {
	
	@Autowired
	private CityService cityService;
	
	@GetMapping(value="/hellos",  produces = { "application/json", "application/xml" })
	public ResponseEntity<String> getAllPessoa() {
		this.cityService.getCitys();
		return new ResponseEntity<String>("teste", HttpStatus.OK);
	}
}

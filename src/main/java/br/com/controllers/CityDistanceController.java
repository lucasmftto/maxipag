package br.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.entity.DistanceResponse;
import br.com.service.CityService;

@RestController
@RequestMapping("/city")
public class CityDistanceController {
	
	@Autowired
	private CityService cityService;
	
	@GetMapping(value="/distance/{unit}",  produces = { "application/json", "application/xml" })
	public ResponseEntity<DistanceResponse> getAllPessoa(@PathVariable("unit") String unit) {
		this.cityService.getCitys();
		double lat1 = -23.53157;
		double long1 = -46.78989;
		double lat2 = -21.71408;
		double long2 = -51.01930;
		DistanceResponse ret = this.cityService.getDistance(lat1, long1, lat2, long2, unit);
		return new ResponseEntity<DistanceResponse>(ret, HttpStatus.OK);
	}
}

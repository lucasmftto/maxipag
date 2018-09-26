package br.com.service;

import java.util.List;

import br.com.entity.City;
import br.com.entity.DistanceResponse;

public interface CityService {

	List<City> getCitys();
	
	DistanceResponse getDistance(double lat1, double lon1, double lat2, double lon2, String unit);

}

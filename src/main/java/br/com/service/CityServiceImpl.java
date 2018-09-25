package br.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.dao.CityDAO;
import br.com.entity.City;

@Service
@Transactional
public class CityServiceImpl implements CityService {
	
	@Autowired
    public CityDAO dao;
	
	@Override
	public List<City> getCitys() {
		return dao.isData();
	}

	

}

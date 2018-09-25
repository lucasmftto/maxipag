package br.com.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.entity.City;

@Repository
public class CityDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String SQL = "select * from CITY";

	public List<City> isData() {

		List<City> citys = new ArrayList<City>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);

		for (Map<String, Object> row : rows) {
			City city = new City();
			city.setId((int)row.get("ID"));
            city.setName((String)row.get("NAME"));
            city.setLongitude((BigDecimal)row.get("LONGITUDE"));
            city.setLatitude((BigDecimal)row.get("LATITUDE"));

			citys.add(city);
		}

		return citys;
	}
}

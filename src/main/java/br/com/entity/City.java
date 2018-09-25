package br.com.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class City implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Integer id;
	
	private String name;
	
	private BigDecimal longitude;

	private BigDecimal latitude;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	

}

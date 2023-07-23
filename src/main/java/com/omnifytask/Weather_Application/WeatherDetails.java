package com.omnifytask.Weather_Application;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class WeatherDetails {
	@Id
	private int pincode;
	private String cityname;
	private String temperature;
	private String humidity;
	private String conditions;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getConditions() {
		return conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	@Override
	public String toString() {
		return "WeatherDetails [pincode=" + pincode + ", cityname=" + cityname + ", temperature=" + temperature
				+ ", humidity=" + humidity + ", conditions=" + conditions + "]";
	}
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}

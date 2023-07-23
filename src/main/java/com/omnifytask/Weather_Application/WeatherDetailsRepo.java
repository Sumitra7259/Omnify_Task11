package com.omnifytask.Weather_Application;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface WeatherDetailsRepo extends CrudRepository<WeatherDetails, Integer> {
	
	
	@Query(value="select * from weather_details where  pincode=?1 " , nativeQuery =true )
	WeatherDetails findpincode(int pincode);
	
	
}

package com.omnifytask.Weather_Application;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepo extends CrudRepository<Admin, Integer> {

	@Query(value="select * from admin where name=?1 or email=?2",nativeQuery = true)
	Admin validate(String name,String email);
	
}

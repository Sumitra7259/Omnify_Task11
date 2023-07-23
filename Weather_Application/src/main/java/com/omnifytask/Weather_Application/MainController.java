package com.omnifytask.Weather_Application;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
@Controller
public class MainController {

	@Autowired
	AdminRepo repo;

	@Autowired
	WeatherDetailsRepo Wrepo;

	@RequestMapping("index")
	String home() {
		return "index.jsp";
	}

	@RequestMapping("login")
	String login( HttpSession h1,String data , String password)
	{
		Admin a1=repo.validate(data, data);// the user name or email are assgined to data
		if(a1!=null)
		{
			if(a1.getPassword().equals(password))
			{
				return"main.jsp";
			}
			else
			{
				try {
					throw new ResourceNotFound();
				}
				catch (Exception e) {
					h1.setAttribute("value", e.getMessage());
					return"error.jsp";
				}
			}
		}
		else
		{
			try {
				throw new ResourceNotFound();
			}
			catch (Exception e) {
				h1.setAttribute("value", e.getMessage());
				return"error.jsp";
			} 
		}


	}
	@RequestMapping("add")
	String addweatherdetails(WeatherDetails l1)
	{
		Wrepo.save(l1);
		return "addweather.jsp";

	}

	@RequestMapping("findpincode")
	String findweather(HttpSession h1,int pincode)
	{
		WeatherDetails l=Wrepo.findpincode(pincode);
		h1.setAttribute("msg", l );
		return"view.jsp";
	}

	

	

}


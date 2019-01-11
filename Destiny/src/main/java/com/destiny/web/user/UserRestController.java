package com.destiny.web.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.destiny.service.domain.Location;
import com.destiny.service.user.UserService;

@RestController
@RequestMapping("/user/*")
public class UserRestController {
	
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	
	@Value("#{commonProperties['pageUnit']}")
	//@Value("#{commonProperties['pageUnit'] ?: 3}")
	int pageUnit;
	
	@Value("#{commonProperties['pageSize']}")
	//@Value("#{commonProperties['pageSize'] ?: 2}")
	int pageSize;
	
	public UserRestController() {	
	}
	
	@RequestMapping(value="json/getLocationList/{city}", method=RequestMethod.GET)
	public Map<String, Object> getLocationList(@PathVariable String city) throws Exception{
		System.out.println("restController 진입 성공. json/getLocationList/"+city);
	
		System.out.println("여긴 오냐?");
		
		Map<String, Object> map = userService.getLocationList(city);
		
		
		System.out.println("끝");
		return map;
	}
	
	
	
}




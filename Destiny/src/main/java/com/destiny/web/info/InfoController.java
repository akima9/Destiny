package com.destiny.web.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.destiny.service.community.CommunityService;

@Controller
@RequestMapping("/info/*")
public class InfoController {
	
	///Field
	@Autowired
	@Qualifier("communityServiceImpl")
	private CommunityService communityService;
	
	///Constructor
	public InfoController() {
		System.out.println(this.getClass());
	}
	
	@Value("#{commonProperties['pageUnit']}")
	int pageUnit;
	
	@Value("#{commonProperties['pageSize']}")
	int pageSize;
	
	///Method
	@RequestMapping(value="listRestaurantInfo", method=RequestMethod.GET)
	public ModelAndView listRestaurantInfo() throws Exception{
		System.out.println("InfoController.listRestaurantInfo()½ÇÇà===============================================");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/community/getRestaurantInfoList.jsp");
		return modelAndView;
	}

}

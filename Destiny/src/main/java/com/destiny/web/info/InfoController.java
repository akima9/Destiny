package com.destiny.web.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.destiny.service.community.CommunityService;
import com.destiny.service.domain.Community;

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
	
	/*getRestaurantInfoList.jsp�� �ܼ� Navigation : start*/
	@RequestMapping(value="listRestaurantInfo", method=RequestMethod.GET)
	public ModelAndView listRestaurantInfo() throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/community/getRestaurantInfoList.jsp");
		return modelAndView;
	}
	/*getRestaurantInfoList.jsp�� �ܼ� Navigation : end*/
	
	
	/*addRestaurantInfo.jsp�� �ܼ� Navigation : start*/
	@RequestMapping(value="addRestaurantInfo", method=RequestMethod.GET)
	public ModelAndView addRestaurantInfo() throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/community/addRestaurantInfo.jsp");
		return modelAndView;
	}
	/*addRestaurantInfo.jsp�� �ܼ� Navigation : end*/
	
	/*�۾��� : start*/
	@RequestMapping(value="addRestaurantInfo", method=RequestMethod.POST)
	public ModelAndView addRestaurantInfo(@ModelAttribute("community") Community community) throws Exception{
		System.out.println("InfoController/addRestaurantInfo/post : ����");
		
		
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/community/addRestaurantInfo.jsp");
		return modelAndView;
	}
	/*�۾��� : end*/
	
	

}

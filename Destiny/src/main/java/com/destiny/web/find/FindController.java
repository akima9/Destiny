package com.destiny.web.find;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.destiny.service.community.CommunityService;
import com.destiny.service.domain.Find;
import com.destiny.service.find.FindService;

@Controller
@RequestMapping("/find/*")
public class FindController {
	
	///Field
		@Autowired
		@Qualifier("findServiceImpl")
		private FindService findService;
		
		///Constructor
		public FindController() {
			System.out.println(this.getClass());
		}
		
		@Value("#{commonProperties['pageUnit']}")
		int pageUnit;
		
		@Value("#{commonProperties['pageSize']}")
		int pageSize;
		
		///Method
		@RequestMapping(value="mainFind", method=RequestMethod.GET)
		public ModelAndView mainFind() throws Exception{
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("redirect:/find/mainFind.jsp");
			return modelAndView;
		}
		
		@RequestMapping(value="selectUser", method=RequestMethod.GET)
		public ModelAndView selectUser() throws Exception{
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("redirect:/find/selectUser.jsp");
			return modelAndView;
		}
		
		@RequestMapping(value="getUserResult", method=RequestMethod.POST)
		public ModelAndView getUserResult(@ModelAttribute("find") Find find) throws Exception{
			System.out.println("/find/getUserResult : POST");
			System.out.println("FIND : "+ find +"======================");
			
			int totalCount = findService.getUserResult(find);
			
			System.out.println("FindMapper.getUserResult ���ٿ� : " + totalCount);
			
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("totalCount",totalCount);
			modelAndView.setViewName("forward:/find/getUserResult.jsp");
			System.out.println("���ٿ� ��� find : " + find);
			return modelAndView;
		}
		
		/*@RequestMapping(value="selectMeeting", method=RequestMethod.GET)
		public ModelAndView selectMeeting() throws Exception{
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("redirect:/find/selectMeeting.jsp");
			return modelAndView;
		}
				
		@RequestMapping(value="getMeetingResult", method=RequestMethod.GET)
		public ModelAndView getMeetingResult() throws Exception{
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("redirect:/find/getMeetingResult.jsp");
			return modelAndView;
		}*/

}

package com.destiny.web.meeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.destiny.service.meeting.MeetingService;

@Controller
@RequestMapping("/meeting/*")
public class MeetingController {
	
	///Field
	
	@Autowired
	@Qualifier("meetingServiceImpl")
	private MeetingService meetingService;
	
	///Constructor
	public MeetingController() {
		System.out.println(this.getClass());
	}
	
	
	@Value("#{commonProperties['pageUnit']}")
	int pageUnit;
	
	@Value("#{commonProperties['pageSize']}")
	int pageSize;
	
	
	///Method
	
	@RequestMapping(value="listMeeting", method=RequestMethod.GET)
	public ModelAndView listMeeting() throws Exception{
		System.out.println("하이리스트");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/meeting/getMeetingList.jsp");
		return modelAndView;
	}
	
	@RequestMapping(value="addMeeting", method=RequestMethod.GET)
	public ModelAndView addMeetingView() throws Exception{
		System.out.println("하이에드");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/meeting/addMeeting.jsp");
		return modelAndView;
	}
	
	@RequestMapping(value="addMeeting", method=RequestMethod.POST)
	public ModelAndView addMeeting() throws Exception{
		System.out.println("하이에드포스트");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/meeting/getMeetingList.jsp");
		return modelAndView;
	}
	
	@RequestMapping(value="getMeeting", method=RequestMethod.GET)
	public ModelAndView getMeeting() throws Exception{
		System.out.println("하이 겟 미팅");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/meeting/getMeeting.jsp");
		return modelAndView;
	}
}

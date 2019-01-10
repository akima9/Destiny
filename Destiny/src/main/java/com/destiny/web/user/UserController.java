package com.destiny.web.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.destiny.service.domain.User;
import com.destiny.service.user.UserService;



@Controller
@RequestMapping("/user/*")
public class UserController {
	
	//Field
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	
	public UserController() {
		System.out.println(this.getClass());
	}
	
	@Value("#{commonProperties['pageUnit']}")
	int pageUnit;
	@Value("#{commonProperties['pageSize']}")
	int pageSize;
	
	@RequestMapping( value="login", method=RequestMethod.GET )
	public ModelAndView login() throws Exception{
		
		System.out.println("/user/login : GET");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/user/userInfo/loginView.jsp");

		return modelAndView;
	}
	
	@RequestMapping( value="login", method=RequestMethod.POST )
	public ModelAndView login(@ModelAttribute("user") User user , HttpSession session) throws Exception{
		
		System.out.println("/user/login : POST");
		System.out.println("userId : " + user.getUserId());
		System.out.println("password : " + user.getPassword());
		
		//Business Logic
		User dbUser=userService.getUser(user.getUserId());
		
		Map loginMap = new HashMap();
		List<User> loginList = new ArrayList<User>();
		
		int numberOfLogin = 0;
		
		if(session.getAttribute("numberOfLogin") != null && (int)session.getAttribute("numberOfLogin") != 0) {
			numberOfLogin = (int) session.getAttribute("numberOfLogin");
		}

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/index.jsp");
		if( user.getPassword().equals(dbUser.getPassword())){
			
			modelAndView.addObject("result", "Success");
			modelAndView.addObject(dbUser.getUserId(), dbUser);
			
			loginList.add(dbUser);
			
			for(User v : loginList) {
				numberOfLogin++;
			}
			
			loginMap.put("loginList", loginList);
			loginMap.put("numberOfLogin", numberOfLogin);
			
			session.setAttribute(dbUser.getUserId(), dbUser);
			
			System.out.println("현제 접속자 : " + numberOfLogin);
		} else {
			modelAndView.addObject("result", "Fail");
		}
		
		
		
		return modelAndView;
	}
	
}

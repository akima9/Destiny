package com.destiny.web.user;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
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
	public ModelAndView login(@ModelAttribute("user") User user , HttpSession session, HttpServletRequest request) throws Exception{
		
		System.out.println("/user/login : POST");
		System.out.println("userId : " + user.getUserId());
		System.out.println("password : " + user.getPassword());
		
		//Business Logic
		User dbUser=userService.getUser(user.getUserId());
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/index.jsp");
		
		//===========================================�α��� + ���� ������ ���� ���� part=================================================
		ServletContext applicationScope = request.getSession().getServletContext();
		
		List<User> loginList = new ArrayList<User>();
		
		if(applicationScope.getAttribute("loginList") != null) {
			loginList = (List<User>) applicationScope.getAttribute("loginList");
		}
		
		int numberOfLogin = 0;
		
		if(applicationScope.getAttribute("numberOfLogin") != null) {
			numberOfLogin = (int) applicationScope.getAttribute("numberOfLogin");
		}

		if( user.getPassword().equals(dbUser.getPassword())){
			
			loginList.add(dbUser);
			
			numberOfLogin++;
			
			applicationScope.setAttribute("loginList", loginList);
			applicationScope.setAttribute("numberOfLogin", numberOfLogin);
			for(User v : loginList) {
				System.out.println("���� ������ ��� : " + v);
			}
			System.out.println("���� ������ : " + numberOfLogin);
			
			modelAndView.addObject("result", "Success");
			modelAndView.addObject(dbUser.getUserId(), dbUser);
			
		} else {
			modelAndView.addObject("result", "Fail");
		}
		//====================================================================================================
		
		//=========================================�⼮üũ ���� ���� part===========================================
		int numAttendCount = dbUser.getAttendCount();
		Date lastLoginDate = dbUser.getLastLoginDay();
		System.out.println(dbUser.getUserId() + "�� ������ �α��� ���� : " + lastLoginDate);
		
		java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());

		System.out.println("���� ��¥(sql) : " + sqlDate);
		
		if(sqlDate.getTime() > lastLoginDate.getTime() ) {
			System.out.println("�ٸ��� �����Դϴ�. ������ ���� : " + lastLoginDate.getTime() + " ���� ���� : " + sqlDate.getTime());
			
			dbUser.setLastLoginDay(sqlDate);
			numAttendCount++;
			dbUser.setAttendCount(numAttendCount);
			
			userService.attendLogin(dbUser);
		} else {
			System.out.println("������ �����Դϴ�. ������ ���� : " + lastLoginDate.getTime() + " ���� ���� : " + sqlDate.getTime());
		}
		//=======================================================================================================
		
		return modelAndView;
	}
	
}
